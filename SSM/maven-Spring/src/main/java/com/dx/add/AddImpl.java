package com.dx.add;

import org.springframework.stereotype.Component;

/**
 * @author 67636
 */
@Component
public class AddImpl implements Add{
    @Override
    public void add() {
        System.out.println("罗浩是我儿子");
    }
}
