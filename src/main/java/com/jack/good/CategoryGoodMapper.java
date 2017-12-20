package com.jack.good;

import com.jack.entity.CategoryGood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:12
 * @desc
 */
@Mapper
public interface CategoryGoodMapper {


    /**
     * 根据类目id查询关联关系
     *
     * @param categoryId
     * @return
     */
    List<CategoryGood> findByCategoryId(@Param("categoryId") Long categoryId);


    /**
     * 绑商品跟类目
     *
     * @param categoryId
     * @param goodId
     * @return
     */
    Integer bindCategoryGood(@Param("categoryId") Long categoryId,
                             @Param("goodId") Long goodId);


    /**
     * 解绑所有跟类目绑定的商品
     *
     * @param categoryId
     * @return
     */
    Integer unbindWithCategoryId(@Param("categoryId") Long categoryId);

    /**
     * 解绑商品跟类目
     *
     * @param goodIdList
     * @return
     */
    int unbindCategoryGood(@Param("goodIdList") List<Long> goodIdList);

    /**
     * 根据商品id解绑商品跟类目
     *
     * @param goodId
     * @return
     */
    Integer unbindWithGoodId(@Param("goodId") Long goodId);

    /**
     * 查询集合中id是否已经绑定
     *
     * @param idList
     * @return
     */
    Integer findCountByCategoryIdList(@Param("idList") List<Long> idList);
}
