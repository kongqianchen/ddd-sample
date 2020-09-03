package center.wxp.dddsample.infrastructure.tunnel.handler;

import center.wxp.dddsample.infrastructure.utils.SnowflakeIdWorkerUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author wxp
 * @apiNote 持久层拦截器
 * @date 1:40 2020/2/9
 **/
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        if (metaObject.getValue("updateTime") == null) {
            this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        }
    }

    /**
     * 处理保存时数据
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        if (metaObject.getValue("createTime") == null) {
            this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        }
        this.strictInsertFill(metaObject, "id", String.class, SnowflakeIdWorkerUtil.getInstance().nextId());
        if (metaObject.getValue("creater") == null) {
            this.strictInsertFill(metaObject, "creater", String.class, metaObject.getValue("creater"));
        }
        this.strictInsertFill(metaObject, "delFlag", Integer.class, 0);
    }


}
