package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 多媒体资源分组表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("multi_media_group")
public class MultiMediaGroupDo extends BaseDo {

    private static final long serialVersionUID=1L;

    /**
     * 资源分组名称
     */
    private String groupName;

    /**
     * 资源根路径
     */
    private String resourceRootPath;

    /**
     * 包含的资源类型 1-图片 2-音频 3-视频
     */
    private String containMultiMediaType;

    /**
     * 状态 0-停用 1-启用
     */
    private Integer status;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static MultiMediaGroupDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, MultiMediaGroupDo.class);
    }


}
