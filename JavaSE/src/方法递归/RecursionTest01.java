package 方法递归;

public class RecursionTest01 {
    //主方法
    public static void main(String[] args) {
        System.out.println("main begin");
        //调用doSome方法
        doSome();

        System.out.println("main end");
    }
    //以下的代码片段虽然只有一份
    //但是可以被重复的调用，并且只要调用doSome方法就会在栈内存中新分配一块所属的内存空间。
    public static void doSome(){
        System.out.println("doSome begin");
        doSome();//这行代码不结束，下一行代码是不能执行的
        System.out.println("doSome end");
    }
}
