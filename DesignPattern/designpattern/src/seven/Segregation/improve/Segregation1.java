package seven.Segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口去依赖(使用)B类
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface interface1 {
    void operation1();
}

interface interface2 {
    void operation2();

    void operation3();
}

interface interface3 {
    void operation4();

    void operation5();
}

class B implements interface1, interface2 {

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

}

class D implements interface1, interface3 {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1方法");
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

class A {
    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend2(interface2 i) {
        i.operation2();
    }

    public void depend3(interface2 i) {
        i.operation3();
    }
}

class C {
    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend4(interface3 i) {
        i.operation4();
    }

    public void depend5(interface3 i) {
        i.operation5();
    }
}
