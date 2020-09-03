
package center.wxp.dddsample.controller.dto;

import center.wxp.dddsample.domain.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 客户类型实体类
 *
 * @author wxp
 * @since 2020-05-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserTypeDTO", description = "客户类型-DTO对象")
public class UserTypeDTO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "客户类型")
    private String name;

    @ApiModelProperty(value = "结束下单时间")
    private String endOrderTime;

    @ApiModelProperty(value = "开始下单时间")
    private String startOrderTime;

    public UserTypeDTO(String userId, String name, String endOrderTime, String startOrderTime) {
        this.userId = userId;
        this.name = name;
        this.endOrderTime = endOrderTime;
        this.startOrderTime = startOrderTime;
    }

    public UserTypeDTO(String userId, String name, String endOrderTime) {
        this.userId = userId;
        this.name = name;
        this.endOrderTime = endOrderTime;
    }

    public static OrderDTO query(String orderId, int totalPrice, int orderStatus, Date createTime) {
        return new OrderDTO(orderId, totalPrice, orderStatus, createTime);
    }
}
