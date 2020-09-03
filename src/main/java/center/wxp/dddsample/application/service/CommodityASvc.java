package center.wxp.dddsample.application.service;

import center.wxp.dddsample.controller.co.add.CommodityAddCO;
import center.wxp.dddsample.controller.co.add.CommodityExtendConfigAddCO;
import center.wxp.dddsample.domain.entity.*;
import center.wxp.dddsample.domain.factory.CommodityFactory;
import center.wxp.dddsample.domain.repository.ICommodityRepo;
import center.wxp.dddsample.infrastructure.utils.BeanUtil;
import center.wxp.dddsample.infrastructure.utils.Result;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 * 商品扩展配置信息表 商品服务
 * </p>
 *
 * @author wxp
 * @since 2020-04-08
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class CommodityASvc {

    @Resource
    private ICommodityRepo iCommodityRepository;

    private CommodityFactory commodityFactory;

    /**
     * 新增商品信息
     *
     * @param addCO 新增商品信息参数对象
     * @return
     */
    public Result save(CommodityAddCO addCO) {
        log.info("新增,修改商品信息params:{}", JSONUtil.parseObj(addCO));
        /** *******暂时的字段******  */
        addCO.setPlatformId("platformId");
        addCO.setTenantId("tenantId");
        addCO.setSellerId("1");
        addCO.setSupplierId("1");
        //暂时设为下架状态。测试完放开
        addCO.setStatus(6);
        /** *******暂时的字段******  */
        if (StringUtils.isBlank(addCO.getTenantId()) || StringUtils.isBlank(addCO.getPlatformId())) {
            return Result.error().setMsg("平台id和租户id不能为空");
        }

        /*通过类目id查询类目是否可用*/
        Result backCategoryResult = iCommodityRepository.getBackCategoryByCategoryId(addCO);
        if (!backCategoryResult.getCode().equals(200)) {
            return backCategoryResult;
        }

        /* 校验品牌状态是否可用*/
        Brand brandInfo = iCommodityRepository.getBrandInfo(addCO);
        //参数特性校验放在应用服务层检验
        if(brandInfo.getDelFlag() == null){
            return Result.failure().setMsg("该品牌信息不存在");
        }
        if (brandInfo.getDelFlag() == 1) {
            return Result.failure().setMsg("该品牌已被平台移除");
        }
        if (brandInfo.getStatus() != 1) {
            return Result.failure().setMsg("该品牌已被平台禁用");
        }

        /* 校验商品编码不重复*/
        Commodity commodity = commodityFactory.toQueryCommodity(addCO);
        List<Commodity> commodities = iCommodityRepository.listCommodity(commodity);
        if (CollectionUtil.isNotEmpty(commodities)) {
            if (addCO.getUpdateCommodityId() == null) {
                return Result.failure().setMsg("该商品编码已被使用");
            } else {
                if (commodities.get(0).getCommodityCode().equals(addCO.getCommodityCode()) && !commodities.get(0).getId().equals(addCO.getUpdateCommodityId())) {
                    return Result.failure().setMsg("该商品编码已被使用");
                }
            }
        }

        /*新增商品详细信息，获取到id，插入商品基本信息表中*/
        String descriptionId = iCommodityRepository.saveDescription(BeanUtil.toModelClass(addCO, CommodityDescription.class));

        /*新增商品基本信息*/
        addCO.setDescriptionId(descriptionId);
        String commodityId = iCommodityRepository.saveCommodity(BeanUtil.toModelClass(addCO, Commodity.class));
        log.info("新增商品基本信息，结果：{}", commodityId);

        /*新增商品扩展配置*/
        CommodityExtendConfigAddCO commodityExtendConfigAddCo = addCO.getCommodityExtendConfigAddCo();
        if (commodityExtendConfigAddCo != null) {
            //@TODO 继承属性是否可以直接复制
            CommodityExtendConfig commodityExtendConfig = BeanUtil.toModelClass(commodityExtendConfigAddCo, CommodityExtendConfig.class);
            iCommodityRepository.saveOrUpdateCommodityExtendConfig(commodityExtendConfig);
        }

        /*新增商品价格设置，该价格落在商品上，并未落在sku上*/
        iCommodityRepository.saveCommodityPrice(BeanUtil.toModelClass(addCO.getCommodityPriceAddCo(), CommodityPrice.class));

        /*每个商品基本信息拥有多张图片，新增商品图片设置*/
        iCommodityRepository.delPic(BeanUtil.toModelClass(addCO.getCommodityPriceAddCo(), CommodityPicture.class));

        // 保存商品图片
        iCommodityRepository.saveCommodityPicture(addCO);

        /*初始化一条商品库存信息*/
        if (StringUtils.isBlank(addCO.getUpdateCommodityId())) {
            iCommodityRepository.saveCommodityInventory(addCO);
        }

        /*TODO 详细附加信息和其他附加信息通过mq异步保存（未处理）*/
        addCO.getDetailInfo();
        addCO.getOtherInfo();
        Map<String, Object> retResult = new HashMap<>(4);
        retResult.put("commodityId", commodityId);
        retResult.put("categoryId", addCO.getCategoryId());
        return Result.ok().setData(retResult);
    }
}
