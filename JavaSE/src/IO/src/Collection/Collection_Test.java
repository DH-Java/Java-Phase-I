package IO.src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/09/12:45
 * @Description:
 */
public class Collection_Test {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("招财",10));
        list.add(new Dog("进宝",11));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=============================");
        for (Object dog :list) {
            System.out.println(dog);
        }

    }
}

class Dog{
    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
