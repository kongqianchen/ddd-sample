package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityBaseInfo;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityBaseInfoDo;
import org.springframework.beans.BeanUtils;

public class CommodityBaseInfoDoWrapper extends BaseDoWrapper<CommodityBaseInfoDo, CommodityBaseInfo> {

    @Override
    public CommodityBaseInfo entityDo(CommodityBaseInfoDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityBaseInfo target = new CommodityBaseInfo();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityBaseInfoDoWrapper build() {
        return new CommodityBaseInfoDoWrapper();
    }
}
