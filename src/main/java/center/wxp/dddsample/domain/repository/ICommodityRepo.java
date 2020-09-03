package center.wxp.dddsample.domain.repository;

import center.wxp.dddsample.controller.co.add.CommodityAddCO;
import center.wxp.dddsample.domain.entity.*;
import center.wxp.dddsample.infrastructure.utils.Result;

import java.util.List;

/**
 * <p>
 * 这次对象需要转换成实体
 * 商品价格表 服务类
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
public interface ICommodityRepo {

    /**
     * 通过类目id查询类目是否可用
     *
     * @param addCO
     * @return
     */
    Result getBackCategoryByCategoryId(CommodityAddCO addCO);

    /**
     * 校验品牌状态是否可用
     *
     * @param addCO
     * @return
     */
    Brand getBrandInfo(CommodityAddCO addCO);

    /**
     * 获取商品list
     *
     * @param commodity
     * @return
     */
    List<Commodity> listCommodity(Commodity commodity);

    /**
     * 保存商品描述
     *
     * @param commodityDescription
     * @return
     */
    String saveDescription(CommodityDescription commodityDescription);

    /**
     * 保存商品信息
     *
     * @param commodity
     * @return
     */
    String saveCommodity(Commodity commodity);

    /**
     * 保存商品配置
     * @param commodityExtendConfig
     * @return
     */
    boolean saveOrUpdateCommodityExtendConfig(CommodityExtendConfig commodityExtendConfig);

    /**
     * 保存商品价格
     * @param commodityPrice
     * @return
     */
    boolean saveCommodityPrice(CommodityPrice commodityPrice);

    /**
     * 删除图片
     * @param commodityPicture
     * @return
     */
    boolean delPic(CommodityPicture commodityPicture);

    /**
     * 保存商品价格
     * @param addCO
     * @return
     */
    boolean saveCommodityPicture(CommodityAddCO addCO);

    /**
     * 保存商品库存
     * @param addCO
     * @return
     */
    boolean saveCommodityInventory(CommodityAddCO addCO);
}
