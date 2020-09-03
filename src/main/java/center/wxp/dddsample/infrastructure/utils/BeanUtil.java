package center.wxp.dddsample.infrastructure.utils;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wuxiaopeng
 * @description: bean操作类
 * @date 2020/1/6 18:43
 */
public class BeanUtil {
    /**
     * list类转换
     *
     * @param entities
     * @param modelBeanClass
     * @param <T>
     * @param <M>
     * @return
     * @throws Exception
     */
    public static <T, M> ArrayList<M> toModelList(List<T> entities, Class<M> modelBeanClass) {
        try {
            ArrayList<M> modelList = new ArrayList<M>();
            if (!EmptyUtil.isEmpty(entities)) {
                for (T entity : entities) {
                    M currentModel = modelBeanClass.newInstance();
                    modelList.add(toModel(entity, currentModel));
                }
            }
            return modelList;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * list类转换（带分页）
     * @param pages
     * @param modelBeanClass
     * @param <V>
     * @param <E>
     * @return
     */
    public static <V, E> IPage<V> toModelListPage(IPage<E> pages, Class<V> modelBeanClass) {
        List<V> records = toModelList(pages.getRecords().stream().collect(Collectors.toList()), modelBeanClass);
        IPage<V> pageVo = new Page<>(pages.getCurrent(), pages.getSize(), pages.getTotal());
        pageVo.setRecords(records);
        return pageVo;
    }

    public static <M, E> M toModel(E entity, M model) {
        if (model != null && entity != null) {
            BeanUtils.copyProperties(entity, model);
        } else {
            model = null;
        }
        return model;
    }

    public static <M, E> M toModelClass(E entity, Class<M> model) {
        try {
            M currentModel = model.newInstance();
            if (model != null && entity != null) {
                BeanUtils.copyProperties(entity, currentModel);
            } else {
                currentModel = null;
            }
            return currentModel;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
