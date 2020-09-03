package center.wxp.dddsample.application.convertor;


import center.wxp.dddsample.infrastructure.utils.ConvertUtils;

import java.util.List;

/**
 * api模型转换接口
 *
 * @param <M> domain model
 * @author wuxiaopeng
 * @since 2020/4/11
 */
public interface IApiAssembler<M> {
    /**
     * 对象转换成Entity
     * @param object
     * @param targetClazz
     * @return
     */
    default M coTransEntity(Object object, Class<M> targetClazz) {
        return ConvertUtils.convert(object, targetClazz);
    }

    /**
     * List对象转换成Entity
     * @param objects
     * @param targetClazz
     * @return
     */
    default List<M> coTransEntity(List<?> objects, Class<M> targetClazz) {
        return ConvertUtils.convert(targetClazz, objects);
    }

}
