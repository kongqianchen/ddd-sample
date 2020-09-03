package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityInventory;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityInventoryDo;
import org.springframework.beans.BeanUtils;

public class CommodityInventoryDoWrapper extends BaseDoWrapper<CommodityInventoryDo, CommodityInventory> {

    @Override
    public CommodityInventory entityDo(CommodityInventoryDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityInventory target = new CommodityInventory();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityInventoryDoWrapper build() {
        return new CommodityInventoryDoWrapper();
    }
}
