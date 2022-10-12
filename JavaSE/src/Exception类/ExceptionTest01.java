package Exception类;

public class ExceptionTest01 {
    public static void main(String[] args) throws ClassNotFoundException{
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        /*try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }
        NumberFormatException numberFormatException =new NumberFormatException("数字格式化异常");
        System.out.println(numberFormatException);*/

        /*
        * 异常在java中以类和对象的形式存在。那么异常的继承结构是怎样的？
        * */
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("vip贵宾");
    }
}
