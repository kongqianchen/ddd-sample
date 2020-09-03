package center.wxp.dddsample.domain.entity;

import com.alibaba.fastjson.JSONObject;
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
public class UserType extends BaseEntity {

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

    public static UserType create(String json) {
        String operId = JSONObject.parseObject(json).getString("operId");
        UserType userType = JSONObject.parseObject(json, UserType.class);
        userType.setCreater(operId);
        return userType;
    }

    public static UserType update(String json) {
        String operId = JSONObject.parseObject(json).getString("operId");
        UserType userType = JSONObject.parseObject(json, UserType.class);
        userType.setUserId(operId);
        return userType;
    }

    public static UserType delete(String json) {
        String operId = JSONObject.parseObject(json).getString("operId");
        UserType userType = JSONObject.parseObject(json, UserType.class);
        userType.setDeleter(operId);
        return userType;
    }
}
