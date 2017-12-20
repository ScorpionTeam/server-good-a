package com.jack.seller;

import com.alibaba.fastjson.JSONObject;
import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import com.jack.entity.MallImage;
import com.jack.result.BaseResult;
import com.jack.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-20下午2:34
 * @desc 卖家商品模块
 */
@RestController
@RequestMapping("seller/good")
public class SellerGoodControler {

    @Autowired
    private SellerGoodService sellerGoodService;

    /**
     * 创建商品
     *
     * @param object
     * @return
     */
    @PostMapping(value = "/add")
    public BaseResult add(@RequestBody JSONObject object) {
        GoodExt goods = object.getObject("good", GoodExt.class);
            List<MallImage> imgList = object.getJSONArray("imageList").toJavaList(MallImage.class);
        goods.setImgList(imgList);
        return sellerGoodService.add(goods);
    }

    /**
     * 修改商品
     *
     * @param object
     * @return
     */
    @PostMapping(value = "/update")
    public BaseResult updateGood(@RequestBody JSONObject object) {
        GoodExt goods = object.getObject("good", GoodExt.class);
        if (object.containsKey("imageList")) {
            List<MallImage> imageList = object.getJSONArray("imageList").toJavaList(MallImage.class);
            goods.setImgList(imageList);
        }
        return sellerGoodService.updateGood(goods);
    }


    /**
     * 批量删除商品
     *
     * @return
     */
    @PostMapping(value = "/batchDeleteGood")
    public BaseResult batchDeleteGood(@RequestBody JSONObject jsonObject) {
        List<Long> idList = jsonObject.getJSONArray("idList").toJavaList(Long.class);
        return sellerGoodService.batchDeleteGood(idList);
    }

    /**
     * 根据商品id查询商品
     *
     * @param id 商品id
     * @return
     */
    @GetMapping(value = "/findById/{id}")
    public BaseResult findById(@PathVariable("id") Long id) {
        return sellerGoodService.findById(id);
    }


    /**
     * 条件查询商品列表
     *
     * @param goodRequestParams
     * @return
     */
    @PostMapping(value = "/findByCondition")
    public PageResult findByCondition(@RequestBody GoodRequestParams goodRequestParams) {
        return sellerGoodService.findByCondition(goodRequestParams);
    }

    /**
     * 批量商品上下架
     *
     * @param object
     * @return
     */
    @PostMapping(value = "/batchModifySaleStatus")
    public BaseResult batchUpdateSaleStatus(@RequestBody JSONObject object) {
        //ON_SALE上架 OFF_SALE下架 默认上架
        String saleStatus = object.getString("saleStatus");
        //商品id集合
        List<Long> goodsIdList = object.getJSONArray("goodsIdList").toJavaList(Long.class);
        return sellerGoodService.batchUpdateSaleStatus(saleStatus, goodsIdList);
    }

    /**
     * 商品库存修改
     *
     * @param count 数量  小于0 扣减，大于0 增加库存
     * @param id    商品id，主键
     * @return
     */
    @GetMapping(value = "/updateGoodStock/{id}/{count}")
    public BaseResult updateGoodStock(@PathVariable("id") Long id,
                                      @PathVariable("count") Integer count) {
        return sellerGoodService.updateGoodStock(id, count);
    }
}
