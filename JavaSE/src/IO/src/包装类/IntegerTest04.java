package IO.src.包装类;

public class IntegerTest04 {
    public static void main(String[] args) {
        //String-->int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 1);

        //int-->String
        String s2 = i1 + "";
        System.out.println(s2 + 1);

        //int-->Integer
        //自动装箱
        Integer x = 1000;

        //Integer-->int
        //自动拆箱
        int y = x;

        //String-->Integer
        Integer k = Integer.valueOf("123");
        System.out.println(k);
        //Integer-->String
        String e = String.valueOf(k);
        System.out.println(e);
    }
}
