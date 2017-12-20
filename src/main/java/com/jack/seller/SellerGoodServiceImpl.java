package com.jack.seller;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jack.common.ServiceCommon;
import com.jack.entity.Good;
import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import com.jack.entity.MallImage;
import com.jack.enums.CommonEnum;
import com.jack.good.CategoryGoodMapper;
import com.jack.good.FileOperationMapper;
import com.jack.good.GoodLogMapper;
import com.jack.result.BaseResult;
import com.jack.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:39
 * @desc
 */
@Service
public class SellerGoodServiceImpl implements SellerGoodService {

    @Autowired
    private SellerGoodMapper sellerGoodMapper;

    @Autowired
    private GoodLogMapper goodLogMapper;

    @Autowired
    private FileOperationMapper fileOperationMapper;

    @Autowired
    private CategoryGoodMapper categoryGoodMapper;

    /**
     * 新增商品
     *
     * @param goodExt goodExt
     * @return BaseResult
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public BaseResult add(GoodExt goodExt) {
        int result = sellerGoodMapper.add(goodExt);
        if (result == 0) {
            return BaseResult.error("add_error", "新增商品失败");
        }
        if (goodExt.getCategoryId() != null) {
            bindCategoryGood(goodExt.getCategoryId(), goodExt.getId());
        }
        //更新图片信息
        List<MallImage> imgList = goodExt.getImgList();
        if (imgList != null && imgList.size() > 0) {
            for (MallImage mallImage : imgList) {
                mallImage.setGoodId(goodExt.getId());
                fileOperationMapper.add(mallImage);
            }
        }
        saveGoodLog(goodExt.getId(), goodExt.getGoodName(), "新增商品");
        return BaseResult.success("新增成功");
    }

    /**
     * 查询详情
     *
     * @param goodId Long
     * @return GoodExt
     */
    @Override
    public BaseResult findById(Long goodId) {
        if (goodId == null) {
            return BaseResult.parameterError();
        }
        GoodExt good = sellerGoodMapper.findById(goodId);
        if (good == null) {
            return BaseResult.notFound();
        }
        //获取图片列表
        List<MallImage> imgList = fileOperationMapper.findByTargetId(good.getId(), 0);
        good.setImgList(imgList);
        return BaseResult.success(good);
    }

    /**
     * 更新商品信息
     *
     * @param goodExt GoodExt
     * @return BaseResult
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public BaseResult updateGood(GoodExt goodExt) {
        if (goodExt.getId() == null) {
            return BaseResult.parameterError();
        }

        GoodExt localGood = sellerGoodMapper.findById(goodExt.getId());
        if (localGood == null) {
            return BaseResult.error("update_error", "未找到商品");
        }

        boolean updateFlag = CommonEnum.ON_SALE.getCode().equals(localGood.getOnSale());
        if (updateFlag) {
            //商品上架状态，不能修改
            return BaseResult.error("update_error", "商品为上架状态，不能修改");
        }
        if (localGood.getCategoryId() != null && goodExt.getCategoryId() == null) {
            //类目解绑
            unbindCategoryGood(localGood.getId());
        } else if (!goodExt.getCategoryId().equals(localGood.getCategoryId())) {
            //类目解绑
            unbindCategoryGood(localGood.getId());
            //绑定类目
            bindCategoryGood(goodExt.getCategoryId(), goodExt.getId());
        }

        sellerGoodMapper.updateGood(goodExt);
        List<MallImage> imgList = goodExt.getImgList();
        if (imgList != null && imgList.size() > 0) {
            //清空原来的图片
            imgList.forEach(item -> fileOperationMapper.deleteById(item.getId()));
            //加入新图片
            imgList.forEach(item -> {
                item.setGoodId(goodExt.getId());
                fileOperationMapper.add(item);
            });
        }
        saveGoodLog(goodExt.getGoodId(), goodExt.getGoodName(), "修改商品信息");
        return BaseResult.success("修改成功");
    }


    /**
     * 批量删除商品
     *
     * @param idList 商品id集合
     * @return BaseResult
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public BaseResult batchDeleteGood(List<Long> idList) {
        if (idList == null || idList.size() == 0) {
            return BaseResult.parameterError();
        }
        int result = sellerGoodMapper.batchDeleteGood(idList);
        if (result == 0) {
            return BaseResult.error("batch_error", "删除失败");
        }
        if (idList.size() > result) {
            return BaseResult.success("部分商品删除失败");
        }
        idList.forEach(goodId -> saveGoodLog(goodId, "", "批量删除商品"));
        return BaseResult.success("删除成功");
    }

    /**
     * 修改库存
     *
     * @param id    商品id--主键
     * @param count 扣减、增加数量
     * @return BaseResult
     */
    @Override
    public BaseResult updateGoodStock(Long id, Integer count) {
        int result = sellerGoodMapper.updateGoodStock(id, count);
        if (result > 0) {
            GoodExt good = sellerGoodMapper.findById(id);
            saveGoodLog(good.getId(), good.getGoodName(), "修改商品库存");
            return BaseResult.success("修改成功");
        }
        return BaseResult.error("update_stock_error", "修改失败");
    }


    /**
     * 批量商品上下架
     *
     * @param saleStatus  上下ON_SALE", "上架 OFF_SALE", "下架"),
     * @param goodsIdList 商品id集合
     * @return BaseResult
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public BaseResult batchUpdateSaleStatus(String saleStatus, List<Long> goodsIdList) {
        if (StringUtils.isEmpty(saleStatus) || goodsIdList == null || goodsIdList.size() == 0) {
            return BaseResult.parameterError();
        }
        sellerGoodMapper.batchUpdateSaleStatus(saleStatus, goodsIdList);
        String action = CommonEnum.ON_SALE.getCode().equals(saleStatus) ? "商品批量上架" : "商品批量下架";
        goodsIdList.forEach(id -> saveGoodLog(id, "", action));
        return BaseResult.success(action + "成功");
    }


    /**
     * 条件查询列表（未绑定活动，未绑定类目，已经绑定活动，模糊查询）
     *
     * @param params GoodRequestParams
     * @return PageResult
     */
    @Override
    public PageResult findByCondition(GoodRequestParams params) {
        if (params.getSellerId() == null) {
            return new PageResult();
        }
        PageHelper.startPage(params.getPageNo(), params.getPageSize());
        if (StringUtils.isEmpty(params.getSearchKey())) {
            params.setSearchKey(null);
        }
        if (!StringUtils.isEmpty(params.getSearchKey())) {
            params.setSearchKey("%" + params.getSearchKey() + "%");
        }
        Page<GoodExt> page;
        if (CommonEnum.UNBIND_CATEGORY.getCode().equals(params.getType())) {
            //未绑定类目的商品列表
            page = sellerGoodMapper.findForCategory(params);
        } else if (CommonEnum.BIND_ACTIVITY.getCode().equals(params.getType())) {
            //已经绑定活动的商品列表搜索
            page = sellerGoodMapper.findByActivityId(params);
        } else if (CommonEnum.UNBIND_ACTIVITY.getCode().equals(params.getType())) {
            //未绑定活动的商品列表
            page = sellerGoodMapper.findForActivity(params);
        } else {
            //基础条件查询
            page = sellerGoodMapper.findByCondition(params);
        }
        return new PageResult(page);
    }


    /**
     * 商品绑定类目
     *
     * @param categoryId Long
     * @param goodId     Long
     */
    private void bindCategoryGood(Long categoryId, Long goodId) {
        categoryGoodMapper.bindCategoryGood(categoryId, goodId);
    }

    /**
     * 商品解绑类目
     *
     * @param goodId Long
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
     * @param goodName String
     * @param action   String
     * @param goodId   Long
     */
    private void saveGoodLog(Long goodId, String goodName, String action) {
        ServiceCommon.saveGoodLog(goodName, action, goodId, goodLogMapper);
    }
}
