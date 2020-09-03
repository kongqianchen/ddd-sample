package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommoditySku;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommoditySkuDo;
import org.springframework.beans.BeanUtils;

public class CommoditySkuDoWrapper extends BaseDoWrapper<CommoditySkuDo, CommoditySku> {

    @Override
    public CommoditySku entityDo(CommoditySkuDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommoditySku target = new CommoditySku();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommoditySkuDoWrapper build() {
        return new CommoditySkuDoWrapper();
    }
}
