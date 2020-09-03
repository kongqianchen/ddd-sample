package center.wxp.dddsample.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 */
@Data
@Component
@ConfigurationProperties(prefix = "mqsetting")
public class MQSettingConfig {


    /**
     * 主题
     */
    private String brandDelTopic;
    /**
     * 消费者组
     */
    private String brandDelGroup;
    /**
     * 订阅标签
     */
    private String brandDelTag;
    /**
     * 主题
     */
    private String categoryBrandDelTopic;
    /**
     * 消费者组
     */
    private String categoryBrandDelGroup;
    /**
     * 订阅标签
     */
    private String categoryBrandDelTag;
}
