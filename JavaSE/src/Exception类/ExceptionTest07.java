package Exception类;

import 练习程序.MyStack;

public class ExceptionTest07 {
    public static void main(String[] args) {
        //创建栈对象
        MyStack stack = new MyStack();
        //压栈

        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
        } catch (ExceptionTest06 exceptionTest06) {
            System.out.println(exceptionTest06.getMessage());
            exceptionTest06.printStackTrace();
        }
        //弹栈
        try {
            stack.pop();
        } catch (ExceptionTest06 exceptionTest06) {
            System.out.println(exceptionTest06.getMessage());
            exceptionTest06.printStackTrace();
        }
    }
}
