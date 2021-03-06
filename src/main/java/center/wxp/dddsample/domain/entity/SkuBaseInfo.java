package center.wxp.dddsample.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yangying
 * @Description:
 * @Date 2020/4/15
 */
@Data
public class SkuBaseInfo {

    /**
     * 商品Id
     */
    private String commodityId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * sku库存
     */
    private BigDecimal skuInventory;

    /**
     * sku价格
     */
    private BigDecimal skuPrice;

    /**
     * 单位名称
     */
    private String unitName;


}
