package com.dx;

import java.util.ArrayList;
/*
* 演示查看对象个数  堆转存 dump
* */
public class Demo_13 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i <200 ; i++) {
            students.add(new Student());
        }
        Thread.sleep(10000000);
    }
}
class Student {
   private byte[] big = new byte[1024*1024];
}
