package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评价多媒体资源表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("commodity_evaluation_multi_media")
public class CommodityEvaluationMultiMediaDo extends BaseDo {

    private static final long serialVersionUID=1L;

    /**
     * 评价id
     */
    private String evaluationId;

    /**
     * 被评价订单号
     */
    private String orderNo;

    /**
     * 资源路径
     */
    private String multiMediaPath;

    /**
     * 资源类型 1-图片 2-音频 3-视频
     */
    private String multiMediaType;

    /**
     * 是否是主要的 0-不是 1-是
     */
    private Integer isMajor;

    /**
     * 远程资源id
     */
    private String resourceId;

    /**
     * 状态 0-停用 1-启用
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityEvaluationMultiMediaDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityEvaluationMultiMediaDo.class);
    }


}
