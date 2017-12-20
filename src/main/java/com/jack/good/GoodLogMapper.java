package com.jack.good;

import com.github.pagehelper.Page;
import com.jack.entity.GoodLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:10
 * @desc 日志
 */
@Mapper
public interface GoodLogMapper {
    /**
     * 添加日志
     *
     * @param goodLog
     * @return
     */
    Integer add(GoodLog goodLog);

    /**
     * 分页模糊查询商品日志
     *
     * @param searchKey
     * @param goodId
     * @return
     */
    Page<GoodLog> findByCondition(@Param("goodId") Long goodId,
                                  @Param("searchKey") String searchKey);

}
