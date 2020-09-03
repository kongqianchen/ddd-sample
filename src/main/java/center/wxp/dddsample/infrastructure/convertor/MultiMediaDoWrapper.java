package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.MultiMedia;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.MultiMediaDo;
import org.springframework.beans.BeanUtils;

public class MultiMediaDoWrapper extends BaseDoWrapper<MultiMediaDo, MultiMedia> {

    @Override
    public MultiMedia entityDo(MultiMediaDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        MultiMedia target = new MultiMedia();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static MultiMediaDoWrapper build() {
        return new MultiMediaDoWrapper();
    }
}
