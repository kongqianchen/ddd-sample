package center.wxp.dddsample.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration("brand-config")
@EnableAsync
public class EventExecutorConfig {

    /**
     * 自定义异步线程池
     *
     * @return
     */
    @Bean("commodity-eventExecutor")
    public TaskExecutor jobExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        executor.setCorePoolSize(50);
        // 设置最大线程数
        executor.setMaxPoolSize(200);
        // 设置队列容量
        executor.setQueueCapacity(500);
        // 设置线程活跃时间（秒）
        executor.setKeepAliveSeconds(60);
        // 设置默认线程名称
        executor.setThreadNamePrefix("event-job");
        // 设置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        executor.initialize();
        return executor;
    }


}
