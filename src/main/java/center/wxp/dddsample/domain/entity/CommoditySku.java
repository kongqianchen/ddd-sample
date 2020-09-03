package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品sku信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommoditySku extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * sku名称(冗余spu_name)
     */
    private String skuName;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 详情图文id
     */
    private String descriptionId;

    /**
     * 商品初始销量
     */
    private Integer initialSalesVolume;

    /**
     * 商品类型同commodity属性
     */
    private String commodityType;

    /**
     * 销售属性集合：attrId:valueId
     */
    private String skuAttributes;

    /**
     * 条码
     */
    private String barCode;

    /**
     * K:V扩展属性JSON(不被检索)
     */
    private String extFeature;

    /**
     * 基础计量单位
     */
    private String basicUnit;

    /**
     * 是否适用基础计量单位 0-否 1-是
     */
    private Integer applyBasicUnit;

    /**
     * 应用计量单位 0-否 1-是
     */
    private Integer applyUnitId;

    /**
     * 基础单位：应用单位 转换比例 1:N
     */
    private String applyUnitConversionRatio;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 库区id
     */
    private String storeAreaId;

    /**
     * 库房id
     */
    private Integer storeHouseId;

    /**
     * 广告
     */
    private String advertising;

    /**
     * 备注
     */
    private String remark;
    /**
     * 商城是否显示 0=不显示 1=显示
     */
    private Integer showFlag;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;
    /**
     * 辅助单位
     */
    private String assistUnit;
    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 初始销量是否显示 0==不显示  1=显示
     */
    private Integer initSales;

    public static CommoditySku create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        String operId = JSONObject.parseObject(json).getString("operId");
        CommoditySku commoditySku = JSONObject.parseObject(json, CommoditySku.class);
        commoditySku.setCreater(operId);
        return commoditySku;
    }


}
