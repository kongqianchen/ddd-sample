package center.wxp.dddsample.controller.co.add;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 商品扩展配置信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CommodityExtendConfigAddCo", description="商品扩展配置信息表-新增CO")
public class CommodityExtendConfigAddCO implements Serializable {

        private static final long serialVersionUID=1L;


        @ApiModelProperty(value = "是否开启规格配置 0-不开启 1-开启")
        private Integer optionsConfig;


        @ApiModelProperty(value = "商品计量类型 1-多单位计量  2-多规格计量 3=单一规格模式")
        private Integer metering;


        @ApiModelProperty(value = "是否标准品 0-否 1-是")
        private Integer standard;


        @ApiModelProperty(value = "价格显示配置 1-商品价 2-市场价")
        private Integer specialPriceConfig;


        @ApiModelProperty(value = "是否显示基础单位 0-否 1-是")
        private Integer displayBasedUnit;


        @ApiModelProperty(value = "是否按基础单位分拣 0-否 1-是")
        private Integer sortingByBasedUnit;


        @ApiModelProperty(value = "起购数量")
        private Integer startPurchaseQuantity;


        @ApiModelProperty(value = "每次限购数量")
        private Integer maxPurchaseQuantity;


        @ApiModelProperty(value = "是否可以参加活动")
        private Integer inActivities;


        @ApiModelProperty(value = "是否标准件 0-否 1-是")
        private Integer isStandard;


       /* *//**
         * 商品规格属性
         *//*
        @ApiModelProperty(value = "商品规格属性")
        private CommodityStandardAddCo commodityStandardAddCo;

        *//**
         * 商品规格值
         *//*
        @ApiModelProperty(value = "商品规格值")
        private List<CommodityStandardValueAddCo> commodityStandardValueAddCoList;*/

        /**
         * 商品扩展配置信息id
         */
        @ApiModelProperty(value = "商品扩展配置信息id(新增时忽略，修改时必传)")
        private String updatecommodityExtendConfigId;

        /**
         * 售卖时间配置 1=不限制售卖  2=自定义售卖
         */
        @ApiModelProperty(value = "售卖时间配置 1=不限制售卖  2=自定义售卖")
        private Integer saleFlag;
}
