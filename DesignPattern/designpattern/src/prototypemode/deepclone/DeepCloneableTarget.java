package prototypemode.deepclone;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/24/17:20
 * @Description:
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    /**
    * @Description: 因为是引用数据类型，因此我们使用默认的clone就行了
    * @Param:
    * @return:
    * @Date: 2022/5/24
    */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
