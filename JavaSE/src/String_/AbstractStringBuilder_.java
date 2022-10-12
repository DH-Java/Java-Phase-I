package String_;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/15/20:10
 * @Description:
 */
@SuppressWarnings("all")
public class AbstractStringBuilder_ {
    public static void main(String[] args) {
        String s1 = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        long l = System.currentTimeMillis();//获取当前系统时间
        for (int i = 0; i <100000 ; i++) {
            s1 = s1.concat("拼接");
        }
        long l1 = System.currentTimeMillis();
        System.out.println("concat拼接需要的时间："+(l1-l));

        l = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            stringBuffer.append("拼接");
        }
        l1 = System.currentTimeMillis();
        System.out.println("StringBuffer拼接所需要的时间："+(l1-l));

        l = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            stringBuilder.append("拼接");
        }
        l1 = System.currentTimeMillis();
        System.out.println("StringBuilder拼接所需要的时间: "+(l1-l));
    }
}
