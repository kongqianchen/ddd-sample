package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@Accessors(chain = true)
@TableName("commodity")
public class CommodityBaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private String id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 平台后台类目编码
     */
    private String categoryId;
    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 供应商id
     */
    private String supplierId;

    /**
     * 商品图文id
     */
    private String descriptionId;

    /**
     * 商品类型 0、附加服务 1、实物商品 2、酒店/民宿 3、餐饮服务 4、景区服务 5、外卖服务 6、虚拟商品
     */
    private String commodityType;

    /**
     * 基础计量单位
     */
    private String basicUnit;

    /**
     * 商品品牌id
     */
    private String brandId;

    /**
     * 运营模式 1-店铺运营 2-平台自营
     */
    private String merchantModel;

    /**
     * 上架时间
     */
    private LocalDateTime putOnShelvesTime;

    /**
     * 下架时间
     */
    private LocalDateTime pullOffShelvesTime;

    /**
     * 商品状态
     */
    private Integer status;

    /**
     * 自定义商品编码
     */
    private String commodityCode;

    /**
     * 商品描述
     */
    private String commodityDescribe;

    /**
     * 平台标识 应用appKey
     */
    private String platformId;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 删除状态 0:未删除，1:已删除
     */
    private Integer delFlag;

    /**
     * 商品主图
     */
    private String pictureUrl;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 商品库存
     */
    private BigDecimal commodityInvertory;

    /**
     * 商品基本单位名称
     */
    private String unitName;

    /**
     * 商品品牌名称
     */
    private String brandName;

    /**
     * sku信息集合
     */
    private List<SkuBaseInfo> skuBaseInfos;

    /**
     * 月售数量
     */
    private Integer mouthSaleAmount;

    public static CommodityBaseInfo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return   JSONObject.parseObject(json, CommodityBaseInfo.class);
    }
}
