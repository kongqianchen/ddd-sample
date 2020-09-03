package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品属性值表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityAttributeValue extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 属性id
     */
    private String attributeId;

    /**
     * 规格值
     */
    private String attributeValue;

    /**
     * 状态 0-停用 1-启用
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer attributeSort;

    /**
     * 属性备注
     */
    private String remark;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityAttributeValue create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityAttributeValue.class);
    }


}
