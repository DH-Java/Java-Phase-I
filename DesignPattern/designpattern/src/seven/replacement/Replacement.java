package seven.replacement;

/**
 * Created with IntelliJ IDEA.
 *  里氏替换原则
 * @Date: 2022/05/17/18:37
 * @Description:
 */
public class Replacement {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11+3="+a.sum(11,3));

        B b = new B();
        System.out.println("11+3="+b.sum1(11,3));
        System.out.println("11+3="+b.sum(11,3));

    }
}
class A{
    public Integer sum(int a,int b){
        return a+b;
    }
}

class B extends A{
    public Integer sum1(int a, int b){
        return a+b;
    }
    public Integer sum(int a,int b){
        return a-b;
    }
}
