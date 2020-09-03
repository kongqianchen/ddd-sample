package center.wxp.dddsample.infrastructure.convertor;

import center.wxp.dddsample.domain.entity.UserType;
import center.wxp.dddsample.infrastructure.tunnel.dataobject.UserTypeDo;
import org.springframework.beans.BeanUtils;

/**
 * @author wxp
 */
public class UserTypeDoWrapper extends BaseDoWrapper<UserTypeDo, UserType> {

    @Override
    public UserType entityDo(UserTypeDo entityDo) {
        if(entityDo == null){
            return  null;
        }
        UserType target = new UserType();
        BeanUtils.copyProperties(entityDo,target);
        return target;
    }

    public static UserTypeDoWrapper build() {
        return new UserTypeDoWrapper();
    }
}
