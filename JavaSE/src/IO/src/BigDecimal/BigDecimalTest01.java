package IO.src.BigDecimal;

import java.math.BigDecimal;

/*
* BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
* 这是SUM提供的一个类。专门用在财务软件当中。java.math.BigDecimal
*
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //这个100不是普通的100，是精度极高的100
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(200);
        //求和
        BigDecimal bigDecimal2 =bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal2);
    }
}
