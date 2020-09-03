package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品图文详情描述表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityDescription extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * 商品图文描述
     */
    private String description;

    public static CommodityDescription create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        String operId = JSONObject.parseObject(json).getString("operId");
        CommodityDescription commodityDescription = JSONObject.parseObject(json, CommodityDescription.class);
        commodityDescription.setCreater(operId);
        return commodityDescription;
    }


}
