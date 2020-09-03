package center.wxp.dddsample.infrastructure.convertor;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wxp
 * @apiNote
 * @date 15:17 2019/12/26
 **/
public abstract class BaseDoWrapper<E, V> {

    public BaseDoWrapper() {
    }

    /**
     * 对象转换
     * @param Do  要转换的实体类
     * @return 转换的结果实体类
     */
    public abstract V entityDo(E Do);

    public List<V> listDo(List<E> list) {
        return list.stream().map(this::entityDo).collect(Collectors.toList());
    }

    public IPage<V> pageEntity(IPage<E> pages) {
        List<V> records = this.listDo(pages.getRecords());
        IPage<V> pageEntity = new Page<>(pages.getCurrent(), pages.getSize(), pages.getTotal());
        pageEntity.setRecords(records);
        return pageEntity;
    }



}
