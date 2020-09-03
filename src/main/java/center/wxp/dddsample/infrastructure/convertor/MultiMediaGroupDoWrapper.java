package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.MultiMediaGroup;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.MultiMediaGroupDo;
import org.springframework.beans.BeanUtils;

public class MultiMediaGroupDoWrapper extends BaseDoWrapper<MultiMediaGroupDo, MultiMediaGroup> {

    @Override
    public MultiMediaGroup entityDo(MultiMediaGroupDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        MultiMediaGroup target = new MultiMediaGroup();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static MultiMediaGroupDoWrapper build() {
        return new MultiMediaGroupDoWrapper();
    }
}
