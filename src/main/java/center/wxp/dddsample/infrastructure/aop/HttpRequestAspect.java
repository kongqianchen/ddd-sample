package center.wxp.dddsample.infrastructure.aop;

import center.wxp.dddsample.infrastructure.utils.IpUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class HttpRequestAspect {

    public static long startTime;
    public static long endTime;

    /*切点表达式*/
    @Pointcut("execution(public * center.wxp.dddsample.controller.facade.*.*(..))")
    public void print() {}

    @Before("print()")
    public void before(JoinPoint joinPoint) {
        try {
            startTime = System.currentTimeMillis();
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = requestAttributes.getRequest();
            String requestURI = request.getRequestURI();
            String remoteAddr = IpUtil.getRealIpAddr(request);
            String requestMethod = request.getMethod();
            Object[] args = joinPoint.getArgs();
            log.info("==================前置切面===================");
            log.info("请求的URL : " + requestURI);
            log.info("请求的方法名称为 : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            log.info("请求的客户端ip = " + remoteAddr);
            if("GET".equals(requestMethod)){
                log.info("请求的参数 : " + JSONObject.toJSONString(request.getParameterMap()));
            }else {
                log.info("请求的参数 : " + Arrays.toString(args));
            }
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
        }
    }

    @After("print()")
    public void after() {
        endTime = System.currentTimeMillis() - startTime;
    }

    @AfterReturning(pointcut = "print()", returning = "object")
    public void getAfterReturn(Object object) {
        try {
            log.info("返回结果：" + JSONObject.toJSONString(object));
            log.info("本次接口耗时={}ms", endTime);
            log.info("==================后置切面===================");
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
        }
    }
}