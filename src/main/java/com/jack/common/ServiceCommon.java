package com.jack.common;

import com.alibaba.druid.util.StringUtils;
import com.jack.entity.*;
import com.jack.good.GoodLogMapper;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

    public static String formatDate(String targetDateString) {
        if (StringUtils.isEmpty(targetDateString)) {
            return null;
        }
        if (targetDateString.contains(" 0800 (中国标准时间)")) {
            targetDateString = targetDateString.replace(" 0800 (中国标准时间)", "+08:00");
        } else {
            return targetDateString;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss", Locale.ENGLISH);
        try {
            Date tmp2 = sdf.parse(targetDateString);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
            targetDateString = sdf2.format(tmp2) + " 23:59:59";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return targetDateString;
    }
}
