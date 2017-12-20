package com.jack.good;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jack.common.ServiceCommon;
import com.jack.entity.Good;
import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import com.jack.entity.MallImage;
import com.jack.enums.CommonEnum;
import com.jack.result.BaseResult;
import com.jack.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private GoodLogMapper goodLogMapper;

    @Autowired
    private FileOperationMapper fileOperationMapper;

    @Autowired
    private CategoryGoodMapper categoryGoodMapper;

    /**
     * 创建商品
     *
     * @param good
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public BaseResult add(GoodExt good) {
        int result = goodMapper.add(good);
        if (result > 0) {
            //更新图片信息
            List<MallImage> imgList = good.getImgList();
            if (imgList != null && imgList.size() > 0) {
                for (MallImage mallImage : imgList) {
                    mallImage.setGoodId(good.getId());
                    fileOperationMapper.add(mallImage);
                }
            }
            if (good.getCategoryId() != null) {
                bindCategoryGood(good.getCategoryId(), good.getId());
            }
            saveGoodLog(good.getGoodName(), "创建商品", good.getId());
            return BaseResult.success("添加成功");
        }
        return BaseResult.error("ERROR", "创建商品失败");
    }

    /**
     * 商品绑定类目
     *
     * @param categoryId
     * @param goodId
     */
    private void bindCategoryGood(Long categoryId, Long goodId) {
        categoryGoodMapper.bindCategoryGood(categoryId, goodId);
    }

    /**
     * 商品解绑类目
     *
     * @param goodId
     */
    private void unbindCategoryGood(Long goodId) {
        if (goodId == null) {
            return;
        }
        categoryGoodMapper.unbindWithGoodId(goodId);
    }

    /**
     * 保持商品操作日志
     *
     * @param goodName
     * @param action
     * @param goodId
     */
    private void saveGoodLog(String goodName, String action, Long goodId) {
        ServiceCommon.saveGoodLog(goodName, action, goodId, goodLogMapper);
    }

    /**
     * 根据id查询商品详情
     *
     * @param goodsId
     * @return
     */
    @Override
    public BaseResult findByGoodId(Long goodsId) {
        GoodExt goods = goodMapper.findById(goodsId);
        if (null == goods) {
            return BaseResult.notFound();
        }
        //获取图片列表
        List<MallImage> imgList = fileOperationMapper.findByTargetId(goods.getId(), 0);
        goods.setImgList(imgList);
        return BaseResult.success(goods);
    }

    /**
     * 根据id修改商品信息
     *
     * @param good 商品信息
     * @return
     */
    @Override
    public BaseResult updateGood(GoodExt good) {
        if (good.getId() == null) {
            return BaseResult.parameterError();
        }
        GoodExt localGood = goodMapper.findById(good.getId());
        if (localGood == null) {
            return BaseResult.error("ERROR", "未找到商品");
        }
        if (!StringUtils.isEmpty(localGood.getOnSale()) &&
                CommonEnum.ON_SALE.getCode().equals(localGood.getOnSale())) {
            //上架状态，不能修改
            return BaseResult.error("ERROR", "商品为上架状态，不能修改");
        }
        if (good.getCategoryId() == null && localGood.getCategoryId() != null) {
            //类目解绑
            unbindCategoryGood(localGood.getId());
        } else if (!good.getCategoryId().equals(localGood.getCategoryId())) {
            //类目解绑
            unbindCategoryGood(localGood.getId());
            //绑定类目
            bindCategoryGood(good.getCategoryId(), good.getId());
        }

        goodMapper.updateGoods(good);
        List<MallImage> imgList = good.getImgList();
        if (imgList != null && imgList.size() > 0) {
            //清空原来的图片
            for (MallImage mallImage : imgList) {
                fileOperationMapper.deleteById(mallImage.getId());
            }
            //插入图片
            for (MallImage mallImage : imgList) {
                mallImage.setGoodId(good.getId());
                fileOperationMapper.add(mallImage);
            }
        }
        saveGoodLog(good.getGoodName(), "修改商品信息", good.getId());
        return BaseResult.success("修改成功");
    }


    /**
     * 商品上下架
     *
     * @param saleStatus saleStatus 1上架 0下架 默认上架  上下ON_SALE", "上架 OFF_SALE", "下架"),
     * @param goodsId    商品id
     * @return
     */
    @Override
    public BaseResult modifySaleStatus(String saleStatus, Long goodsId) {
        if (StringUtils.isEmpty(saleStatus) || null == goodsId) {
            return BaseResult.parameterError();
        }
        List<Long> idList = new ArrayList<>();
        idList.add(goodsId);
        int result = goodMapper.batchModifySaleStatus(saleStatus, idList);
        if (result > 0) {
            String resultString = CommonEnum.ON_SALE.getCode().equals(saleStatus) ? "商品上架成功" : "商品下架成功";
            return BaseResult.success(resultString);
        }
        GoodExt good = goodMapper.findById(goodsId);
        saveGoodLog(good.getGoodName(), CommonEnum.ON_SALE.getCode().equals(saleStatus) ? "商品上架" : "商品下架", goodsId);
        return BaseResult.error("006", CommonEnum.ON_SALE.getCode().equals(saleStatus) ? "商品上架失败" : "商品下架失败");
    }

    /**
     * 根据商品id删除商品
     *
     * @param id 商品id
     * @return
     */
    @Override
    public BaseResult deleteGoodsById(Long id) {
        Good good = goodMapper.findById(id);
        if (CommonEnum.ON_SALE.getCode().equals(good.getOnSale())) {
            return BaseResult.error("ERROR", "删除失败，商品未下架，不能删除");
        }
        List<Long> idList = new ArrayList<>();
        idList.add(id);
        int result = goodMapper.batchDeleteGood(idList);
        if (result > 0) {
            return BaseResult.success("删除商品成功");
        }
        saveGoodLog(good.getGoodName(), "删除商品", good.getId());
        return BaseResult.error("ERROR", "删除商品失败");
    }

    /**
     * 批量删除商品
     *
     * @param idList 商品id集合
     * @return
     */
    @Override
    public BaseResult batchDeleteGood(List<Long> idList) {
        if (idList == null || idList.size() == 0) {
            return BaseResult.parameterError();
        }
        int result = goodMapper.batchDeleteGood(idList);
        if (result == 0) {
            return BaseResult.error("ERROR", "商品未下架，不能删除");
        }
        if (idList.size() > result) {
            return BaseResult.success("部分商品未下架，不能删除，其余的已经删除成功");
        }
        idList.forEach(goodId -> {
            saveGoodLog("", "批量删除商品", goodId);
        });
        return BaseResult.success("删除成功");
    }

    @Override
    public BaseResult modifyGoodsDeduction(Long id, Integer count) {
        int result = goodMapper.modifyGoodsDeduction(id, count);
        if (result > 0) {
            GoodExt good = goodMapper.findById(id);
            saveGoodLog(good.getGoodName(), "修改商品库存", good.getId());
            return BaseResult.success("修改成功");
        }
        return BaseResult.error("ERROR", "修改失败");
    }

    /**
     * 批量商品上下架
     *
     * @param saleStatus  1上架 0下架 默认上架 上下ON_SALE", "上架 OFF_SALE", "下架"),
     * @param goodsIdList 商品id集合
     * @return
     */
    @Override
    public BaseResult batchModifySaleStatus(String saleStatus, List<Long> goodsIdList) {
        if (goodsIdList == null || goodsIdList.size() == 0) {
            return BaseResult.parameterError();
        }
        if (!CommonEnum.ON_SALE.getCode().equals(saleStatus) && !CommonEnum.OFF_SALE.getCode().equals(saleStatus)) {
            return BaseResult.parameterError();
        }
        goodMapper.batchModifySaleStatus(saleStatus, goodsIdList);
        String action = CommonEnum.ON_SALE.getCode().equals(saleStatus) ? "商品批量上架" : "商品批量下架";
        goodsIdList.forEach(goodId -> saveGoodLog("", action, goodId));
        return BaseResult.success(action + "成功");
    }

    @Override
    public PageResult findByCondition(GoodRequestParams requestParams) {
        PageHelper.startPage(requestParams.getPageNo(), requestParams.getPageSize());
        if (StringUtils.isEmpty(requestParams.getSearchKey())) {
            requestParams.setSearchKey(null);
        }
        if (!StringUtils.isEmpty(requestParams.getSearchKey())) {
            requestParams.setSearchKey("%" + requestParams.getSearchKey() + "%");
        }
        Page<GoodExt> page;
        if (CommonEnum.UNBIND_CATEGORY.getCode().equals(requestParams.getType())) {
            //未绑定类目的商品列表
            page = goodMapper.findForCategory(requestParams);
        } else if (CommonEnum.UNBIND_ACTIVITY.getCode().equals(requestParams.getType())) {
            //未绑定活动的商品列表
            page = goodMapper.findForActivity(requestParams);
        } else if (CommonEnum.BIND_ACTIVITY.getCode().equals(requestParams.getType())) {
            //已经绑定活动的商品列表搜索
            page = goodMapper.findByActivityId(requestParams);
        } else {
            //基础条件查询
            page = goodMapper.findByCondition(requestParams);
        }
        return new PageResult(page);
    }

    /**
     * 审核新创建商品
     *
     * @param audit
     * @param reason
     * @param id
     * @return
     */
    @Override
    public BaseResult auditGood(String audit, String reason, Long id) {
        if (id == null) {
            return BaseResult.parameterError();
        }
        if (audit.equals(CommonEnum.NOT_PASS_AUDIT.getCode()) && StringUtils.isEmpty(reason)) {
            return BaseResult.error("ERROR", "请填写失败的原因");
        }
        int result = goodMapper.auditGood(audit, reason, id);
        if (result < 0) {
            return BaseResult.error("ERROR", "审核失败");
        }
        return BaseResult.success("审核成功");
    }
}
