package center.wxp.dddsample.domain.factory;

import center.wxp.dddsample.controller.co.add.CommodityAddCO;
import center.wxp.dddsample.domain.entity.Commodity;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2020-03-19 14:12
 */
@Component
public class CommodityFactory {
    public Commodity toQueryCommodity(CommodityAddCO addCO){
        return new Commodity.Builder()
                .setPlatformId(addCO.getPlatformId())
                .setTenantId(addCO.getTenantId())
                .setDelFlag(0)
                .build();
    }
}
