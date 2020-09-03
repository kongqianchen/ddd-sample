package center.wxp.dddsample.controller.handler;


import center.wxp.dddsample.infrastructure.common.enums.StatusCode;
import center.wxp.dddsample.infrastructure.exception.CustomException;
import center.wxp.dddsample.infrastructure.utils.MySpringUtil;
import center.wxp.dddsample.infrastructure.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wuxiaopeng
 * @description: 全局异常处理！
 * @date 2019/12/11 14:55
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e, HttpServletRequest req, HttpServletResponse response) {
        String uri = req.getRequestURI();
        if (e instanceof CustomException) {
            CustomException ce = (CustomException) e;
            log.error("uri:【{}】 message:【{}】", uri, ce.getMessage(), ce);
            return Result.failure().setCode(ce.getStatusCode()).setMsg(ce.getMessage());
        } else {
            log.error("uri:【{}】 message:【{}】", uri, e.getMessage(), e);
            StackTraceElement[] getStackTrace = e.getStackTrace();
            String profile = MySpringUtil.getActiveProfile();
            if ("dev".equals(profile) || "test".equals(profile)) {
                return Result.failure().setCode(StatusCode.FAILURE.getCode()).
                        setMsg("服务接口异常:【{"
                                + "uri:" + uri + "     "
                                + e.getClass().getSimpleName() + ":"
                                + e.getMessage() + "       "
                                + "错误代码行数：" + getStackTrace[0]
                                + " }】");
            }
            return Result.failure().setCode(StatusCode.FAILURE.getCode()).setMsg("服务繁忙，请稍后重试，或联系管理员！");
        }
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result methodExceptionErrorHandler(MethodArgumentNotValidException ex) {
        StringBuilder sb = new StringBuilder();
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            sb.append(error.getDefaultMessage() + ",");
        }
        return Result.failure().setCode(StatusCode.FAILURE.getCode()).setMsg(sb.toString());
    }

    @ResponseBody
    @ExceptionHandler(BindException.class)
    public Result bindExceptionErrorHandler(BindException ex) {
        StringBuilder sb = new StringBuilder();
        for (FieldError fieldError : ex.getFieldErrors()) {
            sb.append(fieldError.getDefaultMessage() + ",");
        }
        return Result.failure().setCode(StatusCode.FAILURE.getCode()).setMsg(sb.toString());
    }
}
