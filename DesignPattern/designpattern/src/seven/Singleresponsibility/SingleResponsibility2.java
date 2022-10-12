package seven.Singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        EarthVehicle earthVehicle = new EarthVehicle();
        FlyVehicle flyVehicle = new FlyVehicle();
        WhiterVehicle whiterVehicle = new WhiterVehicle();
        earthVehicle.run("汽车");
        flyVehicle.run("飞机");
        whiterVehicle.run("轮船");
    }
}
/*
* 交通类
* 方式二的分析
* 1、遵守单一职责原则
* 2、但是这样做的改动很大，即将类分解，同时修改客户端
* 3、改进：直接修改Vehicle类，改动的代码会比较小。
* */
class EarthVehicle{
    public void run(String EarthVehicle){
        System.out.println(EarthVehicle +"在公路上运行");
    }
}
class FlyVehicle{
    public void run(String FlyVehicle){
        System.out.println(FlyVehicle +"在天空中运行");
    }
}
class WhiterVehicle{
    public void run(String WhiterVehicle){
        System.out.println(WhiterVehicle + "在水中运行");
    }
}