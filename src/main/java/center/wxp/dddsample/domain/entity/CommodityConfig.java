package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品扩展配置信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityConfig extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * 是否开启规格配置 0-不开启 1-开启
     */
    private Integer optionsConfig;

    /**
     * 商品计量类型 1-多单位计量  2-多规格计量3=单一规格模式
     */
    private Integer metering;

    /**
     * 是否标准品 0-否 1-是
     */
    private Integer standard;

    /**
     * 价格显示配置 1-商品价 2-市场价 3-售价
     */
    private Integer specialPriceConfig;

    /**
     * 是否显示基础单位 0-否 1-是
     */
    private Integer displayBasedUnit;

    /**
     * 是否按基础单位分拣 0-否 1-是
     */
    private Integer sortingByBasedUnit;

    /**
     * 起购数量
     */
    private Integer startPurchaseQuantity;

    /**
     * 每次限购数量
     */
    private Integer maxPurchaseQuantity;

    /**
     * 是否可以参加活动
     */
    private Integer inActivities;

    /**
     * 是否标准件 0-否 1-是
     */
    private Integer isStandard;

    public static CommodityConfig create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityConfig.class);
    }


}
