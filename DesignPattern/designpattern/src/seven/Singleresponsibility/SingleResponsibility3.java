package seven.Singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runEarth("汽车");
        vehicle.runFly("飞机");
        vehicle.runWhiter("轮船");
    }
}
/*
* 方案三分析
* 1、这种修改方法没有对原来的类做大的修改，只是增加方法
* 2、这里虽然没有在类的这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则
* */
class Vehicle{
    public void runEarth(String EarthVehicle){
        System.out.println(EarthVehicle+"在公路上运行");
    }
    public void runFly(String FlyVehicle){
        System.out.println(FlyVehicle+"在天空上运行");
    }
    public void runWhiter(String WhiterVehicle){
        System.out.println(WhiterVehicle+"在海中运行");
    }
}
