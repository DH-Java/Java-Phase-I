package dx.com.ioc.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/06/19/11:33
 * @Description:用户类
 */
public class User {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
