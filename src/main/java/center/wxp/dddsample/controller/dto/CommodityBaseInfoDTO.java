package center.wxp.dddsample.controller.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.math.BigDecimal;
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
@Accessors(chain = true)
public class CommodityBaseInfoDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id")
    private String id;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String name;

    /**
     * 平台后台类目编码
     */
    @ApiModelProperty(value = "平台后台类目编码")
    private String categoryId;

    /**
     * 卖家id
     */
    @ApiModelProperty(value = "卖家id")
    private String sellerId;

    /**
     * 供应商id
     */
    @ApiModelProperty(value = "供应商id")
    private String supplierId;

    /**
     * 商品图文id
     */
    @ApiModelProperty(value = "商品图文id")
    private String descriptionId;

    /**
     * 商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品
     */
    @ApiModelProperty(value = "商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品")
    private String commodityType;

    /**
     * 基础计量单位
     */
    @ApiModelProperty(value = "基础计量单位")
    private String basicUnit;

    /**
     * 商品品牌id
     */
    @ApiModelProperty(value = "商品品牌id")
    private String brandId;

    /**
     * 运营模式 1-店铺运营 2-平台自营
     */
    @ApiModelProperty(value = "运营模式 1-店铺运营 2-平台自营")
    private String merchantModel;

    /**
     * 上架时间
     */
    @ApiModelProperty(value = "上架时间")
    private LocalDateTime putOnShelvesTime;

    /**
     * 下架时间
     */
    @ApiModelProperty(value = "下架时间")
    private LocalDateTime pullOffShelvesTime;

    /**
     * 商品状态(1:未发布，2：待审核，3：审核驳回 4：待上架，5：在售（已上架） 6：已下架)
     */
    @ApiModelProperty(value = "商品状态(1:未发布，2：待审核，3：审核驳回 4：待上架，5：在售（已上架） 6：已下架)")
    private Integer status;

    /**
     * 自定义商品编码
     */
    @ApiModelProperty(value = "自定义商品编码")
    private String commodityCode;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述")
    private String commodityDescribe;

    /**
     * 平台标识 应用appKey
     */
    @ApiModelProperty(value = "平台标识 应用appKey")
    private String platformId;

    /**
     * 租户id
     */
    @ApiModelProperty(value = "租户id")
    private String tenantId;

    /**
     * 删除状态 0:未删除，1:已删除
     */
    @ApiModelProperty(value = "删除状态 0:未删除，1:已删除")
    private Integer delFlag;

    /**
     * 商品主图
     */
    @ApiModelProperty(value = "商品主图")
    private String pictureUrl;

    /**
     * 商品价格
     */
    @ApiModelProperty(value = "商品价格")
    @JsonSerialize(using = ToStringSerializer.class)
    private BigDecimal commodityPrice;

    /**
     * 商品库存
     */
    @ApiModelProperty(value = "商品库存")
    private BigDecimal commodityInvertory;

    /**
     * 商品基本单位名称
     */
    @ApiModelProperty(value = "商品基本单位名称")
    private String unitName;

    /**
     * 商品品牌名称
     */
    @ApiModelProperty(value = "商品品牌名称")
    private String brandName;

    /**
     * sku信息集合
     */
    @ApiModelProperty(value = "sku信息集合")
    private List<SkuBaseInfoDTO> skuBaseInfos;

    /**
     * 月售数量
     */
    @ApiModelProperty(value = "月售数量")
    private Integer mouthSaleAmount;
}
