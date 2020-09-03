
package center.wxp.dddsample.controller.dto;

import center.wxp.dddsample.domain.entity.BaseEntity;
import center.wxp.dddsample.domain.entity.Brand;
import center.wxp.dddsample.domain.entity.CommodityPicture;
import center.wxp.dddsample.domain.entity.CommodityPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 商品信息表实体类
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Commodity对象", description = "商品信息表-DTO对象")
public class CommodityDetailDTO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "平台后台类目id")
    private String categoryId;

    @ApiModelProperty(value = "助记码")
    private String mnemonicCode;

    @ApiModelProperty(value = "类目父id")
    private String parentCategoryIds;

    @ApiModelProperty(value = "卖家id")
    private String sellerId;

    @ApiModelProperty(value = "供应商id")
    private String supplierId;

    @ApiModelProperty(value = "运营模式 1-店铺运营 2-平台自营 ")
    private String merchantModel;

    @ApiModelProperty(value = "商品图文id")
    private String descriptionId;

    @ApiModelProperty(value = "商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品")
    private String commodityType;

    @ApiModelProperty(value = "基础计量单位")
    private String basicUnit;

    @ApiModelProperty(value = "商品状态")
    private Integer status;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否是公开品牌 0：否 1：是")
    private Integer publicBrand;

    @ApiModelProperty(value = "商品品牌id")
    private String brandId;

    @ApiModelProperty(value = "自定义品牌名称")
    private String privateBrandName;

    @ApiModelProperty(value = "商品产地")
    private String origin;

    @ApiModelProperty(value = "商品标签")
    private String labels;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "广告")
    private String advertising;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime putOnShelvesTime;

    @ApiModelProperty(value = "下架时间")
    private LocalDateTime pullOffShelvesTime;

    @ApiModelProperty(value = "商城隐藏商品：0不隐藏 1隐藏")
    private Integer mallHide;

    @ApiModelProperty(value = "类目属性集合：attrId:valueId")
    private String attributes;

    @ApiModelProperty(value = "销售属性集合：attrId:valueId")
    private String attributesSale;

    @ApiModelProperty(value = "K:V扩展属性JSON(不被检索)")
    private String extFeature;

    @ApiModelProperty(value = "商品初始销量")
    private Integer initialSalesVolume;

    @ApiModelProperty(value = "条码")
    private String barCode;

    @ApiModelProperty(value = "自定义商品编码")
    private String commodityCode;

    @ApiModelProperty(value = "商品人气值")
    private Integer popularity;

    @ApiModelProperty(value = "是否显示销量（0：不显示 1：显示）")
    private Integer salesFlag;

    @ApiModelProperty(value = "购买须知")
    private String notice;

    @ApiModelProperty(value = "商品描述")
    private String commodityDescribe;

    @ApiModelProperty(value = "平台标识 应用appKey")
    private String platformId;

    @ApiModelProperty(value = "租户id")
    private String tenantId;

    @ApiModelProperty(value = "起购数量")
    private Integer startPurchaseQuantity;
    private String commodityExtendConfigId;

    @ApiModelProperty(value = "商品详情")
    private String description;

    @ApiModelProperty(value = "商品价格对象")
    private CommodityPrice commodityPriceDTO;

    @ApiModelProperty(value = "商品图片对象")
    private List<CommodityPicture> commodityPictures;

    @ApiModelProperty(value = "品牌信息")
    private Brand brandInfo;

}
