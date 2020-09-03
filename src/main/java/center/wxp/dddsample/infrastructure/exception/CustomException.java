package center.wxp.dddsample.infrastructure.exception;

/**
 *
 * @author wuxiaopeng
 * @2020-02-28
 */
public class CustomException extends RuntimeException {

    private int statusCode;
    private String message;

    public CustomException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.message=message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
