package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityStandardValue;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityStandardValueDo;
import org.springframework.beans.BeanUtils;

public class CommodityStandardValueDoWrapper extends BaseDoWrapper<CommodityStandardValueDo, CommodityStandardValue> {

    @Override
    public CommodityStandardValue entityDo(CommodityStandardValueDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityStandardValue target = new CommodityStandardValue();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityStandardValueDoWrapper build() {
        return new CommodityStandardValueDoWrapper();
    }
}
