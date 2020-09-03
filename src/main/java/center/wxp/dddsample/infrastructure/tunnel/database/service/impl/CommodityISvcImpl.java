package center.wxp.dddsample.infrastructure.tunnel.database.service.impl;

import center.wxp.dddsample.infrastructure.tunnel.database.mapper.CommodityMapper;
import center.wxp.dddsample.infrastructure.tunnel.database.service.ICommodityISvc;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityBaseInfoDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityMappingInfoDo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 商品信息表 服务实现类
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
@Service
public class CommodityISvcImpl extends ServiceImpl<CommodityMapper, CommodityDo> implements ICommodityISvc {


    @Override
    public IPage<CommodityBaseInfoDo> getCommodityBaseInfo(IPage page, CommodityBaseInfoDo commodityBaseInfoDo) {
        return this.baseMapper.getBaseCommodityInfo(page,commodityBaseInfoDo);
    }

    @Override
    public IPage<CommodityMappingInfoDo> getCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo) {
        return this.baseMapper.getCommodityMappingInfo(page,commodityMappingInfoDo);
    }

    @Override
    public IPage<CommodityMappingInfoDo> getAllCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo) {
        return this.baseMapper.getAllCommodityMappingInfo(page,commodityMappingInfoDo);
    }

    @Override
    public IPage<CommodityMappingInfoDo> getFrontendCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo) {
        return this.baseMapper.getFrontendCommodityMappingInfo(page,commodityMappingInfoDo);
    }

    @Override
    public IPage<CommodityMappingInfoDo> getAllFrontendCommodityMappingInfo(IPage page, CommodityMappingInfoDo commodityMappingInfoDo) {
        return this.baseMapper.getAllFrontendCommodityMappingInfo(page,commodityMappingInfoDo);
    }

    @Override
    public boolean selectSaleable(CommodityDo commodityDo) {
        return this.baseMapper.selectSaleable(commodityDo)>0;
    }
}
