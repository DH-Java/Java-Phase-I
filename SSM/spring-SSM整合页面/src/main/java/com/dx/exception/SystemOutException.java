package com.dx.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/10/07/8:51
 * @Description:
 */
public class SystemOutException extends RuntimeException{

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public SystemOutException(Integer code) {
        this.code = code;
    }

    public SystemOutException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemOutException(Integer code, Throwable cause , String message) {
        super(message, cause);
        this.code = code;
    }
}
