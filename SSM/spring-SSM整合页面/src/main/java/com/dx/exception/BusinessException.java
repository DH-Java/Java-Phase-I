package com.dx.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/07/8:52
 * @Description:
 */
public class BusinessException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, Throwable cause, String message) {
        super(message, cause);
        this.code = code;
    }
}
