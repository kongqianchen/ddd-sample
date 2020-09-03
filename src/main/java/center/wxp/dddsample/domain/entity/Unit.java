package center.wxp.dddsample.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Unit {
    /**
     * 数据id
     */
    @ApiModelProperty("数据id")
    private String id;

    /**
     * 单位名称
     */
    @ApiModelProperty("单位名称")
    private String unitName;

    /**
     * 单位符号
     */
    @ApiModelProperty("单位符号")
    private String unitSymbol;

    /**
     * 状态 0-停用 1-启用
     */
    @ApiModelProperty("状态 0-停用 1-启用")
    private Integer status;

    /**
     * 平台标识 应用appkey
     */
    @ApiModelProperty("平台标识 应用appkey")
    private String platformId;

    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private String tenantId;

    /**
     * 新建人
     */
    @ApiModelProperty("新建人")
    private String creater;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @ApiModelProperty("更新人")
    private String updater;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 删除人
     */
    @ApiModelProperty("删除人")
    private String deleter;

    /**
     * 删除时间
     */
    @ApiModelProperty("删除时间")
    private Date deleteTime;

    /**
     * 删除状态 0:未删除，1:已删除
     */
    @ApiModelProperty("删除状态 0:未删除，1:已删除")
    private Integer delFlag = 0;
}
