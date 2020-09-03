package center.wxp.dddsample.controller.co.add;

import center.wxp.dddsample.controller.co.BaseCO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "CommodityAddCo", description = "商品信息表-新增CO")
public class CommodityAddCO extends BaseCO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "商品名称不能为空")
    @ApiModelProperty(value = "商品名称", required = true)
    private String name;

    @ApiModelProperty(value = "商品助记码")
    private String mnemonicCode;

    @NotEmpty(message = "后台类目不能为空")
    @ApiModelProperty(value = "平台后台类目id", required = true)
    private String categoryId;

    @ApiModelProperty(value = "平台后台类目父编码")
    private String parentCategoryIds;

    @ApiModelProperty(value = "卖家id")
    private String sellerId;


    @ApiModelProperty(value = "供应商id")
    private String supplierId;


    @ApiModelProperty(value = "运营模式 1-店铺运营 2-平台自营 ")
    private String merchantModel;

    @ApiModelProperty(value = "商品类型 ")
    private String commodityType;

    @NotEmpty(message = "基础计量单位不能为空")
    @ApiModelProperty(value = "基础计量单位", required = true)
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

    @NotEmpty(message = "商品编码不能为空")
    @ApiModelProperty(value = "自定义商品编码", required = true)
    private String commodityCode;


    @ApiModelProperty(value = "商品人气值")
    private Integer popularity;

    @ApiModelProperty(value = "是否显示销量（0：不显示 1：显示）")
    private Integer salesFlag;

    @ApiModelProperty(value = "购买须知")
    private String notice;


    @ApiModelProperty(value = "商品描述")
    private String commodityDescribe;

    /**
     * 商品附加详细信息
     */
    @ApiModelProperty(value = "商品附加详细信息")
    private String detailInfo;
    /**
     * 商品其他附加信息
     */
    @ApiModelProperty(value = "商品其他附加信息")
    private String otherInfo;

    /**
     * 商品详细信息
     */
    @ApiModelProperty(value = "商品详细信息")
    private String description;
    private String descriptionId;

    /**
     * 商品价格对象
     */
    @NotNull(message = "商品价格不能为空")
    @ApiModelProperty(value = "商品价格对象", required = true)
    private CommodityPriceAddCO commodityPriceAddCo;

    /**
     * 商品图片对象
     */
    @NotNull(message = "商品图片不能为空")
    @ApiModelProperty(value = "商品图片对象", required = true)
    private List<CommodityPictureAddCO> commodityPictureAddCo;

    /**
     * 商品详细信息id
     */
    @ApiModelProperty(value = "商品详细信息id(新增时忽略，修改时必传)")
    private String updateDescriptionId;
    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id(新增时忽略，修改时必传)")
    private String updateCommodityId;


    /**
     * 商品起购数量 配置对象
     */
    @ApiModelProperty(value = "商品起购数量 配置对象")
    private CommodityExtendConfigAddCO commodityExtendConfigAddCo;
}
