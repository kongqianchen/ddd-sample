package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityPrice;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityPriceDo;
import org.springframework.beans.BeanUtils;

public class CommodityPriceDoWrapper extends BaseDoWrapper<CommodityPriceDo, CommodityPrice> {

    @Override
    public CommodityPrice entityDo(CommodityPriceDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityPrice target = new CommodityPrice();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityPriceDoWrapper build() {
        return new CommodityPriceDoWrapper();
    }
}
