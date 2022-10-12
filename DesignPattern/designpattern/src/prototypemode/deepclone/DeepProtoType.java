package prototypemode.deepclone;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/05/24/17:23
 * @Description:
 */
public class DeepProtoType implements Serializable, Cloneable {


    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    /**
     * @Description: 深拷贝 方式一使用clone方法
     * @Param: []
     * @return: []
     * @Date: 2022/5/24
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        //这里是完成基本类型的克隆
        Object deep = null;
        deep = super.clone();


        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }
    
    /**
    * @Description: 深拷贝 - 方式二 通过对象的序列化实现（推荐）
    * @Param: []
    * @return: []
    * @Date: 2022/5/24
    */
    public Object deepClone() throws Exception {

        //创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //当前这个对象以对象流的方式输出
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepProtoType readObject = (DeepProtoType) objectInputStream.readObject();

            return readObject;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            byteArrayOutputStream.close();
            objectOutputStream.close();
            byteArrayInputStream.close();
            objectInputStream.close();

        }

    }
}
