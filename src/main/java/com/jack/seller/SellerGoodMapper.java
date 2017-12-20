package com.jack.seller;

import com.github.pagehelper.Page;
import com.jack.entity.Good;
import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:44
 * @desc
 */
@Mapper
public interface SellerGoodMapper {

    /**
     * 创建商品
     *
     * @param good Good
     * @return Integer
     */
    Integer add(Good good);

    /**
     * 根据id查询商品详情
     *
     * @param goodId Long
     * @return   GoodExt
     */
    GoodExt findById(@Param("goodId") Long goodId);

    /**
     * 商品库存扣减
     *
     * @param goodId Long
     * @param count  正数为添加、负数为扣减
     * @return Integer
     */
    Integer updateGoodStock(@Param("goodId") Long goodId,
                            @Param("count") Integer count);

    /**
     * 更新商品信息
     *
     * @param good Good
     * @return Integer
     */
    Integer updateGood(Good good);

    /**
     * d
     *
     * @param goodRequestParams GoodRequestParams
     * @return Page
     */
    Page<GoodExt> findByCondition(GoodRequestParams goodRequestParams);

    /**
     * 商品上下架
     *
     * @param saleStatus saleStatus 1上架 0下架 默认上架
     * @param idList     商品id集合
     * @return Integer
     */
    Integer batchUpdateSaleStatus(@Param("saleStatus") String saleStatus,
                                  @Param("idList") List<Long> idList);

    /**
     * 根据商品id删除商品
     *
     * @param idList 商品id
     * @return Integer
     */
    Integer batchDeleteGood(@Param("idList") List<Long> idList);

    /**
     * 未绑定活动的商品列表
     *
     * @param requestParams GoodRequestParams
     * @return Page
     */
    Page<GoodExt> findForActivity(GoodRequestParams requestParams);

    /**
     * 根据活动id作为主要条件查询列表
     *
     * @param requestParams GoodRequestParams
     * @return Page
     */
    Page<GoodExt> findByActivityId(GoodRequestParams requestParams);

    /**
     * 未绑定类目的商品列表s
     *
     * @param requestParams GoodRequestParams
     * @return Page
     */
    Page<GoodExt> findForCategory(GoodRequestParams requestParams);
}
