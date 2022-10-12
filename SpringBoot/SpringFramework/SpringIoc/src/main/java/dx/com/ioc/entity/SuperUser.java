package dx.com.ioc.entity;

import dx.com.ioc.annotation.Super;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/06/19/12:08
 * @Description:超级用户
 */
@Super
public class SuperUser extends User {
    private String address;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
