package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityStandard;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityStandardDo;
import org.springframework.beans.BeanUtils;

public class CommodityStandardDoWrapper extends BaseDoWrapper<CommodityStandardDo, CommodityStandard> {

    @Override
    public CommodityStandard entityDo(CommodityStandardDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityStandard target = new CommodityStandard();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityStandardDoWrapper build() {
        return new CommodityStandardDoWrapper();
    }
}
