package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommoditySellingTime;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommoditySellingTimeDo;
import org.springframework.beans.BeanUtils;

public class CommoditySellingTimeWrapper extends BaseDoWrapper<CommoditySellingTime, CommoditySellingTimeDo> {

    @Override
    public CommoditySellingTimeDo entityDo(CommoditySellingTime entityDo) {
        if (entityDo == null) {
            return null;
        }
        CommoditySellingTimeDo target = new CommoditySellingTimeDo();
        BeanUtils.copyProperties(entityDo, target);
        return target;
    }

    public static CommoditySellingTimeWrapper build() {
        return new CommoditySellingTimeWrapper();
    }
}
