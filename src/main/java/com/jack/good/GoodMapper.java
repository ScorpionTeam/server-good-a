package com.jack.good;

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
 * @date 17-12-20下午12:18
 * @desc
 */
@Mapper
public interface GoodMapper {

    /**
     * 创建商品
     *
     * @param goods
     * @return
     */
    int add(Good goods);

    /**
     * 根据id查询商品详情
     *
     * @param goodId
     * @return
     */
    GoodExt findById(@Param("goodId") Long goodId);

    /**
     * 商品库存扣减
     *
     * @param goodId
     * @param count  正数为添加、负数为扣减
     * @return
     */
    int modifyGoodsDeduction(@Param("goodId") Long goodId,
                             @Param("count") Integer count);

    /**
     * 更新商品信息
     *
     * @param goods
     * @return
     */
    int updateGoods(Good goods);

    /**
     * d
     *
     * @param goodRequestParams
     * @return
     */
    Page<GoodExt> findByCondition(GoodRequestParams goodRequestParams);

    /**
     * 商品上下架
     *
     * @param saleStatus saleStatus 1上架 0下架 默认上架
     * @param idList     商品id集合
     * @return 更新是否成功 1 成功  0 失败
     */
    int batchModifySaleStatus(@Param("saleStatus") String saleStatus,
                              @Param("idList") List<Long> idList);

    /**
     * 根据商品id删除商品
     *
     * @param idList 商品id
     * @return
     */
    int deleteByIdList(@Param("idList") List<Long> idList);

    /**
     * 库存反还
     *
     * @param goodId
     * @param stock
     * @return
     */
    int updateGoodStockById(@Param("goodId") Long goodId,
                            @Param("stock") int stock);

    /**
     * 未绑定活动的商品列表
     *
     * @param requestParams
     * @return
     */
    Page<GoodExt> findForActivity(GoodRequestParams requestParams);

    /**
     * 根据活动id作为主要条件查询列表
     *
     * @param requestParams
     * @return
     */
    Page<GoodExt> findByActivityId(GoodRequestParams requestParams);

    /**
     * ss
     *
     * @param requestParams
     * @return
     */
    Page<GoodExt> findForCategory(GoodRequestParams requestParams);

    /**
     * 审核新创建商品
     *
     * @param audit
     * @param reason
     * @param id
     * @return
     */
    int auditGood(@Param("audit") String audit,
                  @Param("reason") String reason,
                  @Param("id") Long id);
}
