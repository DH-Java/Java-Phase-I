package com.dx.aopanno;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * 被增强的类
 *
 * @Date: 2022/03/29/15:21
 * @Description:
 */
@Component //创建这个类的对象
public class User {
    public void add() {
        System.out.println("add...");
    }
}
