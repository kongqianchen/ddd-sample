package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品规格属性表
 * </p>
 *
 * @author wxp
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityStandard extends BaseEntity {

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
     * 规格名称
     */
    private String standardName;

    /**
     * 规格字段
     */
    private String standardField;

    /**
     * 状态 0-停用 1-启用
     */
    private Integer status;

    /**
     * 规格排序
     */
    private Integer attributeSort;

    /**
     * 规格备注
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
     * 规格类型 1==系统规格属性 2==自定义规格属性
     */
    private String specType;

    /**
     * 系统规格属性Id
     */
    private String attributeId;

    public static CommodityStandard create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityStandard.class);
    }


}
