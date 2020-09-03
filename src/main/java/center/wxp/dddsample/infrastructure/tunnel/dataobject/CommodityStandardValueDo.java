package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品规格值表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("commodity_standard_value")
public class CommodityStandardValueDo extends BaseDo {

    private static final long serialVersionUID = 1L;

    /**
     * 规格id
     */
    private String standardId;

    /**
     * 规格值
     */
    private String standardValue;

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

    /**
     * 是否被选中（0:否 1：是）
     */
    private Integer selectFlag;

    public static CommodityStandardValueDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return JSONObject.parseObject(json, CommodityStandardValueDo.class);
    }


}
