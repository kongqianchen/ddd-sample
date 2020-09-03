package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("commodity_description")
public class CommodityDescriptionDo extends BaseDo {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String commodityId;

    /**
     * 商品图文描述
     */
    private String description;

    public static CommodityDescriptionDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        String operId = JSONObject.parseObject(json).getString("operId");
        CommodityDescriptionDo commodityDescription = JSONObject.parseObject(json, CommodityDescriptionDo.class);
        commodityDescription.setCreater(operId);
        return commodityDescription;
    }


}
