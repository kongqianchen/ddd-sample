package center.wxp.dddsample.controller.co;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author huangwenxue
 * @version 1.0
 * @email 895367830@qq.com
 * @description
 * @date 2020-04-09:18:05
 */
@Data
@ToString
public class BaseCO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "平台标识 应用appKey", required = true)
    @NotNull(message = "平台标识不能为空")
    private String platformId;

    @ApiModelProperty(value = "租户id")
    private String tenantId;

    /**
     * 操作人
     */
    @ApiModelProperty(value = "操作人")
    private String operId;
}
