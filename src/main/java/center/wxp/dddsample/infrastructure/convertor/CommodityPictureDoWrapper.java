package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityPicture;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityPictureDo;
import org.springframework.beans.BeanUtils;

public class CommodityPictureDoWrapper extends BaseDoWrapper<CommodityPictureDo, CommodityPicture> {

    @Override
    public CommodityPicture entityDo(CommodityPictureDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityPicture target = new CommodityPicture();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityPictureDoWrapper build() {
        return new CommodityPictureDoWrapper();
    }
}
