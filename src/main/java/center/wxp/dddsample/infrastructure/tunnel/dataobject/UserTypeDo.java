package center.wxp.dddsample.infrastructure.tunnel.dataobject;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 客户类型
 * </p>
 *
 * @author wxp
 * @since 2020-05-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_type")
public class UserTypeDo extends BaseDo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 客户类型
     */
    private String name;

    /**
     * 结束下单时间
     */
    private String endOrderTime;

    /**
     * 开始下单时间
     */
    private String startOrderTime;

    public static UserTypeDo create(String json) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        return JSONObject.parseObject(json, UserTypeDo.class);
    }
}
