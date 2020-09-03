package center.wxp.dddsample.controller.co.add;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "CommodityPriceAddCo", description = "商品价格表-新增CO")
public class CommodityPriceAddCO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "基础计价单位 ")
    private String unitId;


    @ApiModelProperty(value = "成本价")
    private BigDecimal costPrice;

    @NotNull(message = "商品价格不能为空")
    @ApiModelProperty(value = "商品价格 售价", required = true)
    private BigDecimal commodityPrice;


    @ApiModelProperty(value = "市场价格")
    private BigDecimal marketPrice;


    @ApiModelProperty(value = "划线价")
    private BigDecimal linePrice;


    @ApiModelProperty(value = "会员价格")
    private BigDecimal memberPrice;


    @ApiModelProperty(value = "打包费")
    private BigDecimal packingCharges;


    @ApiModelProperty(value = "价格适用类型")
    private String priceApplicationType;


    @ApiModelProperty(value = "价格时间限制 0:不限制，1:限制价格")
    private Integer limitTime;


    @ApiModelProperty(value = "价格生效日期")
    private LocalDateTime effectiveTime;


    @ApiModelProperty(value = "价格过期日期")
    private LocalDateTime expirationTime;


    /**
     * 商品价格id
     */
    @ApiModelProperty(value = "商品价格id(新增时忽略，修改时必传)")
    private String updateCommodityPriceId;
}
