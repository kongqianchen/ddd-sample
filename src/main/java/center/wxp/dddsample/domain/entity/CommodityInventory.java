package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品库存表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityInventory extends BaseEntity {

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
     * 库存类型 1-总库存 2-每日库存 3-自动补充库存
     */
    private Integer inventoryType;

    /**
     * 基本库存单位
     */
    private String basicUnit;

    /**
     * 基本库存数量
     */
    private BigDecimal basicInventory;

    /**
     * 新增库存数量
     */
    private BigDecimal addInventory;

    /**
     * 当前库存总数量
     */
    private BigDecimal totalInventory;

    /**
     * 库存预警值（-1不参与预警，大于-1参与预警）
     */
    private BigDecimal stocksForewarn;

    /**
     * 库存生效日期时间
     */
    private LocalDateTime effectiveDate;

    /**
     * 库存失效日期时间
     */
    private LocalDateTime invalidDate;

    /**
     * 状态 0-停用 1-启用
     */
    private Integer status;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommodityInventory create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityInventory.class);
    }


}
