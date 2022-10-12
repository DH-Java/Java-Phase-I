package com.dx.controller;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/10/06/18:58
 * @Description:
 */

public class R {
    private Integer code;
    private Object data;
    private String msg;

    public R() {
    }

    public R(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public R(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
