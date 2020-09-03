package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @apiNote  基类
 * @author DELL
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BaseDo implements Serializable {


    private static final long serialVersionUID = -8562999279633871961L;


    /**
     * 数据Id
     */
    @TableId
    @TableField (value = "id",fill = FieldFill.INSERT)
    private String id;

    /**
     * 新建人
     */
    @TableField (value = "creater",fill = FieldFill.INSERT)
    private String creater;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField (value = "updater",fill = FieldFill.UPDATE)
    private String updater;

    /**
     * 更新时间
     */
    @TableField (value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 删除人
     */
    private String deleter;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;

    /**
     * 删除状态 0:未删除，1:已删除
     */
    @TableField (value = "del_flag",fill = FieldFill.INSERT)
    private Integer delFlag;

}
