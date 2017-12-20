package com.jack.common;

import com.jack.entity.*;
import com.jack.good.GoodLogMapper;
import org.springframework.beans.BeanUtils;

/**
 * @author JackSpeed
 * @version V1.0 <公共业务>
 * @date 17-12-20下午2:09
 * @desc
 */
public class ServiceCommon {
    /**
     * 商品快照组装
     *
     * @param goods
     * @param goodId
     * @return
     */
    public static GoodSnapshot snapshotConstructor(Good goods, Long goodId) {
        GoodSnapshot goodSnapshot = new GoodSnapshot();
        BeanUtils.copyProperties(goods, goodSnapshot);
        goodSnapshot.setGoodId(goodId);
        goodSnapshot.setGoodDescription(goods.getDescription());
        return goodSnapshot;
    }



    public static void saveGoodLog(String gName,
                                   String action,
                                   Long goodId,
                                   GoodLogMapper goodLogMapper) {
        GoodLog goodLog = new GoodLog();
        goodLog.setAction(action);
        goodLog.setGoodId(goodId);
        goodLog.setGoodName(gName);
        goodLogMapper.add(goodLog);
    }
}
