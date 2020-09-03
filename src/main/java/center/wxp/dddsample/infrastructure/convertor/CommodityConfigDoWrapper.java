package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityConfig;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityConfigDo;
import org.springframework.beans.BeanUtils;

public class CommodityConfigDoWrapper extends BaseDoWrapper<CommodityConfigDo, CommodityConfig> {

    @Override
    public CommodityConfig entityDo(CommodityConfigDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityConfig target = new CommodityConfig();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityConfigDoWrapper build() {
        return new CommodityConfigDoWrapper();
    }
}
