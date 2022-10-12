package Collection;

import java.util.TreeSet;

//对自定义的数据可以排序吗
/*
*   以下程序中对Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
*   谁打谁小并没有说明啊。
*
*
*
* */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person P1 = new Person(123,"lisi");
        Person P2 = new Person(15,"zhangsan");
        Person P3 = new Person(15,"wangwu");
        Person P4 = new Person(16,"wanglu");
        TreeSet<Person> set = new TreeSet<>();
        set.add(P1);
        set.add(P2);
        set.add(P3);
        set.add(P4);

        for (Person data:set
             ) {
            System.out.println(data);
        }
    }
}
//放在TreeSet集合中的元素需要实现java.lang.Comparable接口。
//并且实现compareToff，equals方法可以不写
class Person implements Comparable<Person>{
    int age;
    String name;

    public Person(int age , String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + "neme="+name+'}';
    }


    //需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较！
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较，返回值可能是>0 <0 = 0
    //比较规则最终还是由程序员指定的：例如按照年龄的升序，或者降序。


    //compareTo方法的返回值很重要：
        //返回0表示相同，value会覆盖。
        //返回>0，会继续在右子树上找。【10-9=1】，1>0就说明左边这个数字比较大。所以就在右子树上找。】
        //返回<0，会继续在左子树上找。
    public int compareTo(Person o) {//c1.compareTo(c2)
        /*
        * this = c1
        * o = c2
        * c1和c2进行比较就是this和O进行比较。
        * */
        /*int age1 = this.age;
        int age2 = o.age;
        if (age1 == age2){
            return 0;
        }else if (age1 >age2){
            return 1;
        }else {
            return -1;
        }*/
        if (this.age == o.age){
            //年龄相同时按照名字排序。
            //姓名是String类型，可以直接比较，调用compareTo来完成比较。
            return this.name.compareTo(o.name);
        }else {
            //年龄不一样。
            return this.age - o.age;
        }

    }
}
