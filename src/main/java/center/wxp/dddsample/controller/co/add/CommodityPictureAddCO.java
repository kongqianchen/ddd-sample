package center.wxp.dddsample.controller.co.add;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 * 图片信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "CommodityPictureAddCo", description = "图片信息表-新增CO")
public class CommodityPictureAddCO implements Serializable {

    private static final long serialVersionUID = 1L;


    @NotEmpty(message = "图片url不能为空")
    @ApiModelProperty(value = "图片url", required = true)
    private String pictureUrl;


    @ApiModelProperty(value = "图片远程id")
    private String pictureId;


    @ApiModelProperty(value = "图片组别")
    private String pictureGroup;

    @ApiModelProperty(value = "封面/主图 0-不是 1-是")
    private Integer cover;

    @NotNull(message = "排序号不能为空")
    @ApiModelProperty(value = "排序", required = true)
    private Integer sort;

}
