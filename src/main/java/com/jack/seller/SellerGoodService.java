package com.jack.seller;

import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import com.jack.result.BaseResult;
import com.jack.result.PageResult;

import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:38
 * @desc 商家商品模块
 */
public interface SellerGoodService {
    /**
     * 创建商品
     *
     * @param goodExt GoodExt
     * @return
     */
    BaseResult add(GoodExt goodExt);


    /**
     * 根据id查询商品详情
     *
     * @param goodId
     * @return
     */
    BaseResult findById(Long goodId);

    /**
     * 根据id修改商品信息
     *
     * @param goodExt
     * @return
     */
    BaseResult updateGood(GoodExt goodExt);

    /**
     * ss
     *
     * @param goodRequestParams
     * @return
     */
    PageResult findByCondition(GoodRequestParams goodRequestParams);

    /**
     * 批量删除商品
     *
     * @param idList 商品id集合
     * @return
     */
    BaseResult batchDeleteGood(List<Long> idList);

    /**
     * 商品库存减扣
     *
     * @param id    商品id--主键
     * @param count 扣减、增加数量
     * @return BaseResult
     */
    BaseResult updateGoodStock(Long id, Integer count);

    /**
     * 批量商品上下架
     *
     * @param saleStatus 1上架 0下架 默认上架
     * @param goodIdList 商品id集合
     * @return
     */
    BaseResult batchUpdateSaleStatus(String saleStatus, List<Long> goodIdList);
}
