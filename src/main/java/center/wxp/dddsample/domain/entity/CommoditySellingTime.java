package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 外卖商品售卖信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommoditySellingTime extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 商品信息id
     */
    private String commodityId;

    /**
     * 售卖日期方式 1-星期 2-日期段
     */
    private Integer sellingDateType;

    /**
     * 一周内周几售卖 0123456
     */
    private String sellingAvailableDayOfWeek;

    /**
     * 有效日期段
     */
    private String sellingAvailableDate;

    /**
     * 配送时间段 0-全天 1-时间段
     */
    private Integer sellingTimeType;

    /**
     * 售卖时间段
     */
    private String sellingAvailableTime;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    public static CommoditySellingTime create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommoditySellingTime.class);
    }


}
