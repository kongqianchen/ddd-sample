package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 客户商品价格！
 * </p>
 *
 * @author wxp
 * @since 2020-05-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UserCommodityPrice extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer commodityId;

    /**
     * skuId
     */
    private Integer skuId;

    /**
     * 供应商id
     */
    private Integer supplierId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static UserCommodityPrice create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, UserCommodityPrice.class);
    }


}
