package IO.src.Exception类;

public class ExceptionTest04 {
    public static void main(String[] args) {
    int result =m();
        System.out.println(result);

    }

    //输出的m值是100。
    public static int m(){
        int i = 100;
        try {
            return i;
        }finally {
            i++;
        }
    }
}
