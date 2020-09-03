package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityMappingInfo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityMappingInfoDo;
import org.springframework.beans.BeanUtils;

public class CommodityMappingInfoDoWrapper extends BaseDoWrapper<CommodityMappingInfoDo, CommodityMappingInfo> {

    @Override
    public CommodityMappingInfo entityDo(CommodityMappingInfoDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityMappingInfo target = new CommodityMappingInfo();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityMappingInfoDoWrapper build() {
        return new CommodityMappingInfoDoWrapper();
    }
}
