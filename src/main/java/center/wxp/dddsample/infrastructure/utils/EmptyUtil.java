package center.wxp.dddsample.infrastructure.utils;

/**
 * Created by Le0n on 2017/2/28.
 */
import java.util.List;
import java.util.Set;

/**
 * 判断对象是否为空
 *
 * @author Rex
 *
 */
public class EmptyUtil
{
    /**
     * 判断对象为空
     *
     * @param obj
     *            对象名
     * @return 是否为空
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object obj)
    {
        if (obj == null)
        {
            return true;
        }
        if ((obj instanceof List))
        {
            return ((List) obj).size() == 0;
        }
        if ((obj instanceof Set))
        {
            return ((Set) obj).size() == 0;
        }
        if ((obj instanceof String))
        {
            return "".equals(((String) obj).trim());
        }
        return false;
    }

    /**
     * 判断对象不为空
     *
     * @param obj
     *            对象名
     * @return 是否不为空
     */
    public static boolean isNotEmpty(Object obj)
    {
        return !isEmpty(obj);
    }
}
