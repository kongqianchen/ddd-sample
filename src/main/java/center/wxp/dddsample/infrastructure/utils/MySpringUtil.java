package center.wxp.dddsample.infrastructure.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wxp
 * @apiNote
 * @date 13:24 2020/2/14
 **/
@Component
public class MySpringUtil implements ApplicationContextAware {


    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MySpringUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 获取当前环境上下文
     *
     * @return
     */
    public static String getActiveProfile() {
        return applicationContext.getEnvironment().getActiveProfiles()[0];
    }

    public static Object getBean(String name) throws BeansException {
        Object o = applicationContext.getBean(name);
        return o;
    }

    public static <T> T getBean(Class<T> clazz) {
        return clazz == null ? null : applicationContext.getBean(clazz);
    }

}


