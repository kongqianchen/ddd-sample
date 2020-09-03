package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityExtendConfig;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityExtendConfigDo;
import org.springframework.beans.BeanUtils;

public class CommodityExtendConfigDoWrapper extends BaseDoWrapper<CommodityExtendConfigDo, CommodityExtendConfig> {

    @Override
    public CommodityExtendConfig entityDo(CommodityExtendConfigDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityExtendConfig target = new CommodityExtendConfig();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityExtendConfigDoWrapper build() {
        return new CommodityExtendConfigDoWrapper();
    }
}
