package seven.Singleresponsibility;
/*
*@Author:DH
*@Date:2021/12/16 23:23
*@Description:TODO
** @param null
*@return:
*/
public class SingleResponsibility1 {
    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}

//交通工具类
//方式一
//1、在方式1中的run方法中，违反了单一职责原则
//2、解决方案非常的简单，根据交通工具运行的方式不同，分解成不同的类即可
class vehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"在公路运行");
    }
}
