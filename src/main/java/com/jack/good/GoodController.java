package com.jack.good;

import com.alibaba.fastjson.JSONObject;
import com.jack.entity.GoodExt;
import com.jack.entity.GoodRequestParams;
import com.jack.entity.MallImage;
import com.jack.result.BaseResult;
import com.jack.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backstage/good")
public class GoodController {

    private static final String IMAGE_LIST = "imageList";


    @Autowired
    private GoodService goodService;

    /**
     * 创建商品
     *
     * @param object
     * @return
     */
    @PostMapping(value = "/add")
    public BaseResult add(@RequestBody JSONObject object) {
        GoodExt goods = object.getObject("good", GoodExt.class);
        List<MallImage> imgList = object.getJSONArray(IMAGE_LIST).toJavaList(MallImage.class);
        goods.setImgList(imgList);
        return goodService.add(goods);
    }

    /**
     * 根据商品id删除商品
     *
     * @param id 商品id
     * @return
     */
    @GetMapping(value = "/deleteById/{id}")
    public BaseResult deleteById(@PathVariable("id") Long id) {
        return goodService.deleteGoodsById(id);
    }

    /**
     * 批量删除商品
     *
     * @return
     */
    @PostMapping(value = "/deleteByIdList")
    public BaseResult deleteByIdList(@RequestBody JSONObject jsonObject) {
        List<Long> idList = jsonObject.getJSONArray("idList").toJavaList(Long.class);
        return goodService.deleteByIdList(idList);
    }

    /**
     * 根据商品id查询商品
     *
     * @param id 商品id
     * @return
     */
    @GetMapping(value = "/findById/{id}")
    public BaseResult findByGoodId(@PathVariable("id") Long id) {
        return goodService.findByGoodId(id);
    }


    /**
     * 分页条件查询商品
     * @param goodRequestParams
     * @return
     */
    @PostMapping(value = "/findByCondition")
    public PageResult findByCondition(@RequestBody GoodRequestParams goodRequestParams) {
        return goodService.findByCondition(goodRequestParams);
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
        if (object.containsKey(IMAGE_LIST)) {
            List<MallImage> imageList = object.getJSONArray(IMAGE_LIST).toJavaList(MallImage.class);
            goods.setImgList(imageList);
        }
        return goodService.updateGood(goods);
    }


    /**
     * 商品上下架
     *
     * @param saleStatus 1上架 0下架 默认上架
     * @param id         商品id
     * @return
     */
    @GetMapping(value = "/updateSaleStatus")
    public BaseResult updateSaleStatus(String saleStatus, Long id) {
        return goodService.updateSaleStatus(saleStatus, id);
    }

    /**
     * 批量商品上下架
     *
     * @param object
     * @return
     */
    @PostMapping(value = "/batchModifySaleStatus")
    public BaseResult batchModifySaleStatus(@RequestBody JSONObject object) {
        //1上架 0下架 默认上架
        String saleStatus = object.getString("saleStatus");
        //商品id集合
        List<Long> goodsIdList = object.getJSONArray("goodsIdList").toJavaList(Long.class);
        return goodService.batchModifySaleStatus(saleStatus, goodsIdList);
    }

    /**
     * 商品库存修改
     *
     * @param count 数量  小于0 扣减，大于0 增加库存
     * @param id    商品id，主键
     * @return
     */
    @GetMapping(value = "/updateDeduction/{id}/{count}")
    public BaseResult updateDeduction(@PathVariable("id") Long id,
                                      @PathVariable("count") Integer count) {
        return goodService.updateDeduction(id, count);
    }

    /**
     * 新创建商品审核
     *
     * @param audit
     * @param reason
     * @param id
     * @return
     */
    @PostMapping(value = "/auditGood")
    public BaseResult auditGood(String audit,
                                String reason,
                                Long id) {
        return goodService.auditGood(audit, reason, id);
    }

}
