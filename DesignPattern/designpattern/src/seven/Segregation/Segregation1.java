package seven.Segregation;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口去依赖(使用)B类
        C c = new C();
        c.depend1(new D());
    }
}

interface interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements interface1 {

    @Override
    public void operation1() {
        System.out.println("B实现了operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3方法");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了operation5方法");
    }
}

class D implements interface1 {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3方法");

    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4方法");

    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5方法");

    }
}

class A {//A类通过接口依赖（使用）B类，但是只会用到1，2，3 方法

    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend2(interface1 i) {
        i.operation2();
    }

    public void depend3(interface1 i) {
        i.operation3();
    }

}

class C {//C类通过接口依赖（使用）D类，但是只会用到1，4，5 方法
    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend4(interface1 i) {
        i.operation4();
    }

    public void depend5(interface1 i) {
        i.operation5();
    }
}
