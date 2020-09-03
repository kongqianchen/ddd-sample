package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 图片信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CommodityPicture extends BaseEntity {

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
     * 图片url
     */
    private String pictureUrl;

    /**
     * 图片远程id
     */
    private String pictureId;

    /**
     * 图片组别
     */
    private String pictureGroup;

    /**
     * 封面/主图 0-不是 1-是
     */
    private Integer cover;

    /**
     * 排序
     */
    private Integer sort;

    public static CommodityPicture create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityPicture.class);
    }


}
