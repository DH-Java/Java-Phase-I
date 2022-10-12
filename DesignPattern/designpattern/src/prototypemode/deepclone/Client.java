package prototypemode.deepclone;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/05/24/17:29
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        DeepProtoType protoType = new DeepProtoType("武松", new DeepCloneableTarget("打虎", "英雄"));
    /*    //方式一
        DeepProtoType clone = (DeepProtoType)protoType.clone();*/


        //方式二
        DeepProtoType clone = (DeepProtoType) protoType.deepClone();
        System.out.println(protoType);
        System.out.println(protoType.hashCode());
        System.out.println(clone.hashCode());
        System.out.println(protoType==clone);
    }
}
