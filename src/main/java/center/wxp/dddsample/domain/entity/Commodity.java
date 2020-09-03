package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Commodity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品助记码
     */
    private String mnemonicCode;

    /**
     * 平台后台类目编码
     */
    private String categoryId;

    /**
     * 类目父id
     */
    private String parentCategoryIds;
    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 供应商id
     */
    private String supplierId;

    /**
     * 运营模式 1-店铺运营 2-平台自营
     */
    private String merchantModel;

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
     * 商品状态
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 是否是公开品牌 0：否 1：是
     */
    private Integer publicBrand;

    /**
     * 商品品牌id
     */
    private String brandId;

    /**
     * 自定义品牌名称
     */
    private String privateBrandName;

    /**
     * 商品产地
     */
    private String origin;

    /**
     * 商品标签
     */
    private String labels;

    /**
     * 关键字
     */
    private String keywords;

    /**
     * 广告
     */
    private String advertising;

    /**
     * 上架时间
     */
    private LocalDateTime putOnShelvesTime;

    /**
     * 下架时间
     */
    private LocalDateTime pullOffShelvesTime;

    /**
     * 商城隐藏商品：0不隐藏 1隐藏
     */
    private Integer mallHide;

    /**
     * 类目属性集合：attrId:valueId
     */
    private String attributes;

    /**
     * 销售属性集合：attrId:valueId
     */
    private String attributesSale;

    /**
     * K:V扩展属性JSON(不被检索)
     */
    private String extFeature;

    /**
     * 商品初始销量
     */
    private Integer initialSalesVolume;

    /**
     * 条码
     */
    private String barCode;

    /**
     * 自定义商品编码
     */
    private String commodityCode;

    /**
     * 商品人气值
     */
    private Integer popularity;
    /**
     * "是否显示销量（0：不显示 1：显示）")
     */
    private Integer salesFlag;
    /**
     * 购买须知
     */
    private String notice;

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

    public Commodity(Builder builder){
        this.name = builder.name;
        this.mnemonicCode = builder.mnemonicCode;
        this.categoryId = builder.categoryId;
        this.parentCategoryIds = builder.parentCategoryIds;
        this.sellerId = builder.sellerId;
        this.supplierId = builder.supplierId;
        this.merchantModel = builder.merchantModel;
        this.descriptionId = builder.descriptionId;
        this.commodityType = builder.commodityType;
        this.basicUnit = builder.basicUnit;
        this.status = builder.status;
        this.sort = builder.sort;
        this.publicBrand = builder.publicBrand;
        this.brandId = builder.brandId;
        this.privateBrandName = builder.privateBrandName;
        this.origin = builder.origin;
        this.labels = builder.labels;
        this.keywords = builder.keywords;
        this.advertising = builder.advertising;
        this.putOnShelvesTime = builder.putOnShelvesTime;
        this.pullOffShelvesTime = builder.pullOffShelvesTime;
        this.mallHide = builder.mallHide;
        this.attributes = builder.attributes;
        this.attributesSale = builder.attributesSale;
        this.extFeature = builder.extFeature;
        this.initialSalesVolume = builder.initialSalesVolume;
        this.barCode = builder.barCode;
        this.commodityCode = builder.commodityCode;
        this.popularity = builder.popularity;
        this.salesFlag = builder.salesFlag;
        this.notice = builder.notice;
        this.commodityDescribe = builder.commodityDescribe;
        this.platformId = builder.platformId;
        this.tenantId = builder.tenantId;
    }

    public static class Builder extends BuildBaseEntity {
        /**
         * 商品名称
         */
        private String name;
        /**
         * 商品助记码
         */
        private String mnemonicCode;

        /**
         * 平台后台类目编码
         */
        private String categoryId;

        /**
         * 类目父id
         */
        private String parentCategoryIds;
        /**
         * 卖家id
         */
        private String sellerId;

        /**
         * 供应商id
         */
        private String supplierId;

        /**
         * 运营模式 1-店铺运营 2-平台自营
         */
        private String merchantModel;

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
         * 商品状态
         */
        private Integer status;

        /**
         * 排序
         */
        private Integer sort;

        /**
         * 是否是公开品牌 0：否 1：是
         */
        private Integer publicBrand;

        /**
         * 商品品牌id
         */
        private String brandId;

        /**
         * 自定义品牌名称
         */
        private String privateBrandName;

        /**
         * 商品产地
         */
        private String origin;

        /**
         * 商品标签
         */
        private String labels;

        /**
         * 关键字
         */
        private String keywords;

        /**
         * 广告
         */
        private String advertising;

        /**
         * 上架时间
         */
        private LocalDateTime putOnShelvesTime;

        /**
         * 下架时间
         */
        private LocalDateTime pullOffShelvesTime;

        /**
         * 商城隐藏商品：0不隐藏 1隐藏
         */
        private Integer mallHide;

        /**
         * 类目属性集合：attrId:valueId
         */
        private String attributes;

        /**
         * 销售属性集合：attrId:valueId
         */
        private String attributesSale;

        /**
         * K:V扩展属性JSON(不被检索)
         */
        private String extFeature;

        /**
         * 商品初始销量
         */
        private Integer initialSalesVolume;

        /**
         * 条码
         */
        private String barCode;

        /**
         * 自定义商品编码
         */
        private String commodityCode;

        /**
         * 商品人气值
         */
        private Integer popularity;
        /**
         * "是否显示销量（0：不显示 1：显示）")
         */
        private Integer salesFlag;
        /**
         * 购买须知
         */
        private String notice;

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
         * 数据Id
         */
        @TableField (value = "id",fill = FieldFill.INSERT)
        private String id;

        /**
         * 新建人
         */
        @TableField (value = "creater",fill = FieldFill.INSERT)
        private String creater;

        /**
         * 创建时间
         */
        @TableField(value = "create_time",fill = FieldFill.INSERT)
        private LocalDateTime createTime;

        /**
         * 更新人
         */
        @TableField (value = "updater",fill = FieldFill.UPDATE)
        private String updater;

        /**
         * 更新时间
         */
        @TableField (value = "update_time",fill = FieldFill.UPDATE)
        private LocalDateTime updateTime;

        /**
         * 删除人
         */
        private String deleter;

        /**
         * 删除时间
         */
        private LocalDateTime deleteTime;

        /**
         * 删除状态 0:未删除，1:已删除
         */
        @TableField (value = "del_flag",fill = FieldFill.INSERT)
        private Integer delFlag;

        public Commodity build(){
            return new Commodity(this);
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCreater(String creater) {
            this.creater = creater;
            return this;
        }

        public Builder setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setUpdater(String updater) {
            this.updater = updater;
            return this;
        }

        public Builder setUpdateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setDeleter(String deleter) {
            this.deleter = deleter;
            return this;
        }

        public Builder setDeleteTime(LocalDateTime deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }

        public Builder setDelFlag(Integer delFlag) {
            this.delFlag = delFlag;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMnemonicCode(String mnemonicCode) {
            this.mnemonicCode = mnemonicCode;
            return this;
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setParentCategoryIds(String parentCategoryIds) {
            this.parentCategoryIds = parentCategoryIds;
            return this;
        }

        public Builder setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        public Builder setSupplierId(String supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder setMerchantModel(String merchantModel) {
            this.merchantModel = merchantModel;
            return this;
        }

        public Builder setDescriptionId(String descriptionId) {
            this.descriptionId = descriptionId;
            return this;
        }

        public Builder setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }

        public Builder setBasicUnit(String basicUnit) {
            this.basicUnit = basicUnit;
            return this;
        }

        public Builder setStatus(Integer status) {
            this.status = status;
            return this;
        }

        public Builder setSort(Integer sort) {
            this.sort = sort;
            return this;
        }

        public Builder setPublicBrand(Integer publicBrand) {
            this.publicBrand = publicBrand;
            return this;
        }

        public Builder setBrandId(String brandId) {
            this.brandId = brandId;
            return this;
        }

        public Builder setPrivateBrandName(String privateBrandName) {
            this.privateBrandName = privateBrandName;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setLabels(String labels) {
            this.labels = labels;
            return this;
        }

        public Builder setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder setAdvertising(String advertising) {
            this.advertising = advertising;
            return this;
        }

        public Builder setPutOnShelvesTime(LocalDateTime putOnShelvesTime) {
            this.putOnShelvesTime = putOnShelvesTime;
            return this;
        }

        public Builder setPullOffShelvesTime(LocalDateTime pullOffShelvesTime) {
            this.pullOffShelvesTime = pullOffShelvesTime;
            return this;
        }

        public Builder setMallHide(Integer mallHide) {
            this.mallHide = mallHide;
            return this;
        }

        public Builder setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributesSale(String attributesSale) {
            this.attributesSale = attributesSale;
            return this;
        }

        public Builder setExtFeature(String extFeature) {
            this.extFeature = extFeature;
            return this;
        }

        public Builder setInitialSalesVolume(Integer initialSalesVolume) {
            this.initialSalesVolume = initialSalesVolume;
            return this;
        }

        public Builder setBarCode(String barCode) {
            this.barCode = barCode;
            return this;
        }

        public Builder setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        public Builder setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }

        public Builder setSalesFlag(Integer salesFlag) {
            this.salesFlag = salesFlag;
            return this;
        }

        public Builder setNotice(String notice) {
            this.notice = notice;
            return this;
        }

        public Builder setCommodityDescribe(String commodityDescribe) {
            this.commodityDescribe = commodityDescribe;
            return this;
        }

        public Builder setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        
        

        public String getName() {
            return name;
        }

        public String getMnemonicCode() {
            return mnemonicCode;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public String getParentCategoryIds() {
            return parentCategoryIds;
        }

        public String getSellerId() {
            return sellerId;
        }

        public String getSupplierId() {
            return supplierId;
        }

        public String getMerchantModel() {
            return merchantModel;
        }

        public String getDescriptionId() {
            return descriptionId;
        }

        public String getCommodityType() {
            return commodityType;
        }

        public String getBasicUnit() {
            return basicUnit;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getSort() {
            return sort;
        }

        public Integer getPublicBrand() {
            return publicBrand;
        }

        public String getBrandId() {
            return brandId;
        }

        public String getPrivateBrandName() {
            return privateBrandName;
        }

        public String getOrigin() {
            return origin;
        }

        public String getLabels() {
            return labels;
        }

        public String getKeywords() {
            return keywords;
        }

        public String getAdvertising() {
            return advertising;
        }

        public LocalDateTime getPutOnShelvesTime() {
            return putOnShelvesTime;
        }

        public LocalDateTime getPullOffShelvesTime() {
            return pullOffShelvesTime;
        }

        public Integer getMallHide() {
            return mallHide;
        }

        public String getAttributes() {
            return attributes;
        }

        public String getAttributesSale() {
            return attributesSale;
        }

        public String getExtFeature() {
            return extFeature;
        }

        public Integer getInitialSalesVolume() {
            return initialSalesVolume;
        }

        public String getBarCode() {
            return barCode;
        }

        public String getCommodityCode() {
            return commodityCode;
        }

        public Integer getPopularity() {
            return popularity;
        }

        public Integer getSalesFlag() {
            return salesFlag;
        }

        public String getNotice() {
            return notice;
        }

        public String getCommodityDescribe() {
            return commodityDescribe;
        }

        public String getPlatformId() {
            return platformId;
        }

        public String getTenantId() {
            return tenantId;
        }
    }


    public static Commodity create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        String operId = JSONObject.parseObject(json).getString("operId");
        Commodity commodity = JSONObject.parseObject(json, Commodity.class);
        commodity.setCreater(operId);
        return commodity;
    }


}
