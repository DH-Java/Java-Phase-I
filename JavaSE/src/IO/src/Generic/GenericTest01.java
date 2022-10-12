package IO.src.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//泛型
public class GenericTest01 {
    public static void main(String[] args) {
      /*  //不使用泛型机制，分析优缺点。
        List myList = new ArrayList();
        Cat cat = new Cat();
        Bird bird = new Bird();
        myList.add(cat);
        myList.add(bird);
        Iterator iterator = myList.iterator();
        while (iterator.hasNext());
        Object obj = iterator.next();
        if (obj instanceof Animal){
            Animal animal = (Animal)obj;
            animal.move();
        }*/

        //使用泛型机制
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        //使用泛型来指定集合中存储的数据类型。
        List<Animal> myList1 = new ArrayList<Animal>();
        //myList.add("a");
        Cat cat = new Cat();
        Bird bird = new Bird();
        myList1.add(cat);
        myList1.add(bird);
        //获取迭代器
        //这个表示迭代器代的是Animal类型
       Iterator<Animal> iterator = myList1.iterator();
       while (iterator.hasNext()) {
           Animal animal;
           animal = iterator.next();
           animal.move();


        //调用子类特有的方法还是需要向下转型的
        if (animal instanceof Cat) {
            Cat cat1 = (Cat) animal;
            cat1.catchMouse();
        }
            if (animal instanceof Bird){
                Bird bird1 = (Bird) animal;
                bird1.fly();
            }
       }
        }


}

class  Animal{
    public void move(){
        System.out.println("动物在移动");
    }

}

class Cat extends Animal {
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}

class Bird extends Animal {
    public void fly(){
        System.out.println("鸟在飞翔");
    }
}
