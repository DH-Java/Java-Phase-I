package com.dx;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/*
* 演示元空间内存溢出
* -XX：MaxMetaspaceSize=8m
* */
public class Demo_8 extends ClassLoader{//可以用来加载类的二进制字节码
    public static void main(String[] args) {
        int j= 0;
        Long l = 1000000000000000000L;
        try{
            Demo_8 demo_8 = new Demo_8();
            for (int i = 0; i <l ; i++) {
                //ClassWriter 作用是生成类的二进制字节码
                ClassWriter cw = new ClassWriter(0);
                //版本号 ，public，类名，包名，父类，接口
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                //返回byte[]
                byte[] code = cw.toByteArray();
                //执行了类的加载
                demo_8.defineClass("Class" + i, code, 0, code.length);
            }
        }finally {
                System.out.println(j);
        }
    }
}
