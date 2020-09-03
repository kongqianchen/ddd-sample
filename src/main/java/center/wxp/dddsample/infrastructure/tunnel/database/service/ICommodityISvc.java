package center.wxp.dddsample.infrastructure.tunnel.database.service;

import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityBaseInfoDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityMappingInfoDo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 * 商品信息表 服务类
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
public interface ICommodityISvc extends IService<CommodityDo> {

    public IPage<CommodityBaseInfoDo> getCommodityBaseInfo(IPage page, CommodityBaseInfoDo commodityBaseInfoDo);

    public IPage<CommodityMappingInfoDo> getCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo);

    public IPage<CommodityMappingInfoDo> getAllCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo);

    public IPage<CommodityMappingInfoDo> getFrontendCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo);

    public IPage<CommodityMappingInfoDo> getAllFrontendCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo);

    boolean selectSaleable(CommodityDo commodityDo);
}
