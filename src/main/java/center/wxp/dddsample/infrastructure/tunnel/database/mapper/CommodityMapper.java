package center.wxp.dddsample.infrastructure.tunnel.database.mapper;

import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityBaseInfoDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityMappingInfoDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 * 商品信息表 Mapper 接口
 * </p>
 *
 * @author wxp
 * @since 2020-04-09
 */
public interface CommodityMapper extends BaseMapper<CommodityDo> {

    IPage<CommodityBaseInfoDo> getBaseCommodityInfo(IPage page, @Param("entity") CommodityBaseInfoDo commodityBaseInfoDo);

    IPage<CommodityMappingInfoDo> getCommodityMappingInfo(IPage page, @Param("entity") CommodityMappingInfoDo commodityMappingInfoDo);

    IPage<CommodityMappingInfoDo> getAllCommodityMappingInfo(IPage page, @Param("entity") CommodityMappingInfoDo commodityMappingInfoDo);

    IPage<CommodityMappingInfoDo> getFrontendCommodityMappingInfo(IPage page, @Param("entity") CommodityMappingInfoDo commodityMappingInfoDo);

    IPage<CommodityMappingInfoDo> getAllFrontendCommodityMappingInfo(IPage page, @Param("entity") CommodityMappingInfoDo commodityMappingInfoDo);

    int selectSaleable(@Param("entity") CommodityDo commodityDo);
}
