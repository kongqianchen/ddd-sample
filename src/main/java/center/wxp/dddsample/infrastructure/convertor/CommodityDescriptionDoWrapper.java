package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityDescription;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityDescriptionDo;
import org.springframework.beans.BeanUtils;

public class CommodityDescriptionDoWrapper extends BaseDoWrapper<CommodityDescriptionDo, CommodityDescription> {

    @Override
    public CommodityDescription entityDo(CommodityDescriptionDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityDescription target = new CommodityDescription();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityDescriptionDoWrapper build() {
        return new CommodityDescriptionDoWrapper();
    }
}
