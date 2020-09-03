package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityAttributeValue;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityAttributeValueDo;
import org.springframework.beans.BeanUtils;

public class CommodityAttributeValueDoWrapper extends BaseDoWrapper<CommodityAttributeValueDo, CommodityAttributeValue> {

    @Override
    public CommodityAttributeValue entityDo(CommodityAttributeValueDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityAttributeValue target = new CommodityAttributeValue();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityAttributeValueDoWrapper build() {
        return new CommodityAttributeValueDoWrapper();
    }
}
