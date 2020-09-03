package center.wxp.dddsample.infrastructure.utils;

import center.wxp.dddsample.infrastructure.common.enums.StatusCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2019/10/30 15:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("返回类")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("code")
    private Integer code = 200;

    @ApiModelProperty("返回信息")
    private String msg = "操作成功";

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("对象")
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Result setDescription(String description) {
        this.description = description;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public static Result ok() {
        return new Builder()
                .code(StatusCode.SUCCESS.getCode())
                .msg(StatusCode.SUCCESS.getMsg())
                .build();
    }

    public static Result failure() {
        return new Builder()
                .code(StatusCode.FAILURE.getCode())
                .msg(StatusCode.FAILURE.getMsg())
                .build();
    }


    public static Result error() {
        return new Builder()
                .code(StatusCode.ERROR.getCode())
                .msg(StatusCode.ERROR.getMsg())
                .build();
    }

    private Result(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.description = builder.description;
        this.data = (T) builder.data;
    }

    public static class Builder<T> {
        private Integer code;
        private String msg;
        private String description;
        private T data;

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder data(T data) {
            this.data = data;
            return this;
        }

        public Result build() {
            return new Result(this);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }
}
