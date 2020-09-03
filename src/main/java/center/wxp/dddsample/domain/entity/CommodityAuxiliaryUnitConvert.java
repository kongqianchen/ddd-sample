package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品辅助计量单位转换表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityAuxiliaryUnitConvert extends BaseEntity {

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
     * 基础计量单位id
     */
    private String basicUnit;

    /**
     * 辅助计量单位id
     */
    private String auxiliaryUnitId;

    /**
     * 基础单位：辅助单位 转换比例 1:N
     */
    private String conversionRatio;

    public static CommodityAuxiliaryUnitConvert create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityAuxiliaryUnitConvert.class);
    }


}
