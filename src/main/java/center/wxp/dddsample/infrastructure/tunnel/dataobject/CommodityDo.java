package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("commodity")
public class CommodityDo extends BaseDo {

    private static final long serialVersionUID = 1L;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品助记码
     */
    private String mnemonicCode;
    /**
     * 平台后台类目编码
     */
    private String categoryId;

    /**
     * 类目父id
     */
    private String parentCategoryIds;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 供应商id
     */
    private String supplierId;

    /**
     * 运营模式 1-店铺运营 2-平台自营
     */
    private String merchantModel;

    /**
     * 商品图文id
     */
    private String descriptionId;

    /**
     * 商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品
     */
    private String commodityType;

    /**
     * 基础计量单位
     */
    private String basicUnit;

    /**
     * 商品状态
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 是否是公开品牌 0：否 1：是
     */
    private Integer publicBrand;

    /**
     * 商品品牌id
     */
    private String brandId;

    /**
     * 自定义品牌名称
     */
    private String privateBrandName;

    /**
     * 商品产地
     */
    private String origin;

    /**
     * 商品标签
     */
    private String labels;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 广告
     */
    private String advertising;

    /**
     * 上架时间
     */
    private LocalDateTime putOnShelvesTime;

    /**
     * 下架时间
     */
    private LocalDateTime pullOffShelvesTime;

    /**
     * 商城隐藏商品：0不隐藏 1隐藏
     */
    private Integer mallHide;

    /**
     * 类目属性集合：attrId:valueId
     */
    private String attributes;

    /**
     * 销售属性集合：attrId:valueId
     */
    private String attributesSale;

    /**
     * K:V扩展属性JSON(不被检索)
     */
    private String extFeature;

    /**
     * 商品初始销量
     */
    private Integer initialSalesVolume;

    /**
     * 条码
     */
    private String barCode;

    /**
     * 自定义商品编码
     */
    private String commodityCode;

    /**
     * 商品人气值
     */
    private Integer popularity;
    /**
     * "是否显示销量（0：不显示 1：显示）")
     */
    private Integer salesFlag;
    /**
     * 购买须知
     */
    private String notice;

    /**
     * 商品描述
     */
    private String commodityDescribe;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        String operId = JSONObject.parseObject(json).getString("operId");
        CommodityDo commodity = JSONObject.parseObject(json, CommodityDo.class);
        commodity.setCreater(operId);
        return commodity;
    }


}
