package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品评价表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("commodity_evaluation")
public class CommodityEvaluationDo extends BaseDo {

    private static final long serialVersionUID=1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * skuId
     */
    private String skuId;

    /**
     * 评价人id
     */
    private String evaluatorId;

    /**
     * 评价人类型 1-买家 2-卖家
     */
    private String evaluatorType;

    /**
     * 评价人店铺id
     */
    private String evaluatorSupplierId;

    /**
     * 被评价人id
     */
    private Long appraisedId;

    /**
     * 被评价人类型 1-买家 2-卖家
     */
    private String appraisedType;

    /**
     * 被评价店铺id
     */
    private String appraisedSupplierId;

    /**
     * 被评价订单号
     */
    private String orderNo;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 原始评价内容
     */
    private String originalContent;

    /**
     * 显示的评价内容
     */
    private String content;

    /**
     * 1:买家对卖家评价 2:卖家对买家评价 
     */
    private String evaluationType;

    /**
     * 1：默认评价 2:手动评价
     */
    private Integer isDefaultEvaluation;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityEvaluationDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityEvaluationDo.class);
    }


}
