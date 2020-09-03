package center.wxp.dddsample.controller.co.query;

import center.wxp.dddsample.controller.co.BaseCO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
@ApiModel(value="CommodityQueryCo", description="商品信息表-查询CO")
public class CommodityQueryInCO extends BaseCO implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "页码",example="1")
    private int page;

    @ApiModelProperty(value = "每页行数",example="10")
    private int limit;

    @ApiModelProperty(value = "数据id")
    private String id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "平台后台类目id")
    @NotNull(message = "类目id不能为空")
    private String categoryId;

    @ApiModelProperty(value = "卖家id")
    private String sellerId;

    @ApiModelProperty(value = "供应商id")
    private String supplierId;

    @ApiModelProperty(value = "商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品")
    private String commodityType;

    @ApiModelProperty(value = "商品状态")
    private Integer status;

    @ApiModelProperty(value = "关键字")
    private String keywords;

}
