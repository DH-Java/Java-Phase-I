package com.dx.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/13/18:55
 * @Description:
 */
public class Money implements Serializable {
    private String mname;
    private BigDecimal yue;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public BigDecimal getYue() {
        return yue;
    }

    public void setYue(BigDecimal yue) {
        this.yue = yue;
    }

    @Override
    public String toString() {
        return "Money{" +
                "mname='" + mname + '\'' +
                ", yue=" + yue +
                '}';
    }
}
