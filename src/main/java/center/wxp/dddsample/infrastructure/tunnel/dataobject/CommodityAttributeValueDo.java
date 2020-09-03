package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("commodity_attribute_value")
public class CommodityAttributeValueDo extends BaseDo {

    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @TableId
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

    public static CommodityAttributeValueDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return JSONObject.parseObject(json, CommodityAttributeValueDo.class);
    }


}
