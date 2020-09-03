package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.CommodityEvaluation;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.CommodityEvaluationDo;
import org.springframework.beans.BeanUtils;

public class CommodityEvaluationDoWrapper extends BaseDoWrapper<CommodityEvaluationDo, CommodityEvaluation> {

    @Override
    public CommodityEvaluation entityDo(CommodityEvaluationDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        CommodityEvaluation target = new CommodityEvaluation();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static CommodityEvaluationDoWrapper build() {
        return new CommodityEvaluationDoWrapper();
    }
}
