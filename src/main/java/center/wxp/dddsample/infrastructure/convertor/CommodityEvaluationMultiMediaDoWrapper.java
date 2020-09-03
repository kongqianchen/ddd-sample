package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityEvaluationMultiMedia;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityEvaluationMultiMediaDo;
import org.springframework.beans.BeanUtils;

public class CommodityEvaluationMultiMediaDoWrapper extends BaseDoWrapper<CommodityEvaluationMultiMediaDo, CommodityEvaluationMultiMedia> {

    @Override
    public CommodityEvaluationMultiMedia entityDo(CommodityEvaluationMultiMediaDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityEvaluationMultiMedia target = new CommodityEvaluationMultiMedia();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityEvaluationMultiMediaDoWrapper build() {
        return new CommodityEvaluationMultiMediaDoWrapper();
    }
}
