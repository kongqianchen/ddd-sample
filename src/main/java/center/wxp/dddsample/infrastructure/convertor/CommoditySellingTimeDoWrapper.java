package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommoditySellingTime;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommoditySellingTimeDo;
import org.springframework.beans.BeanUtils;

public class CommoditySellingTimeDoWrapper extends BaseDoWrapper<CommoditySellingTimeDo, CommoditySellingTime> {

    @Override
    public CommoditySellingTime entityDo(CommoditySellingTimeDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommoditySellingTime target = new CommoditySellingTime();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommoditySellingTimeDoWrapper build() {
        return new CommoditySellingTimeDoWrapper();
    }
}
