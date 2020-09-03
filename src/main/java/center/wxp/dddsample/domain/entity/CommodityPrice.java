package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品价格表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityPrice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * skuId
     */
    private String skuId;

    /**
     * 基础计价单位
     */
    private String unitId;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 市场价格
     */
    private BigDecimal marketPrice;

    /**
     * 划线价
     */
    private BigDecimal linePrice;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    /**
     * 打包费
     */
    private BigDecimal packingCharges;

    /**
     * 价格适用类型
     */
    private String priceApplicationType;

    /**
     * 价格时间限制 0:不限制，1:限制价格
     */
    private Integer limitTime;

    /**
     * 价格生效日期
     */
    private LocalDateTime effectiveTime;

    /**
     * 价格过期日期
     */
    private LocalDateTime expirationTime;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityPrice create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        CommodityPrice commodityPrice = JSONObject.parseObject(json, CommodityPrice.class);
        return commodityPrice;

    }


}
