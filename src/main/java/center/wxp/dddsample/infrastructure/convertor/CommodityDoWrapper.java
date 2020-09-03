package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.Commodity;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDo;
import org.springframework.beans.BeanUtils;

public class CommodityDoWrapper extends BaseDoWrapper<CommodityDo, Commodity> {

    @Override
    public Commodity entityDo(CommodityDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        Commodity target = new Commodity();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityDoWrapper build() {
        return new CommodityDoWrapper();
    }
}
