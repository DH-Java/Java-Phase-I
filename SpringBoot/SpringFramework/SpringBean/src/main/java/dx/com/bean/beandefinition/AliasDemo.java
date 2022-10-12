package dx.com.bean.beandefinition;

import dx.com.ioc.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/07/01/10:17
 * @Description:
 */
public class AliasDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-definitions-context.xml");
        User user = beanFactory.getBean("user", User.class);
        User aliasUser = beanFactory.getBean("alias-user", User.class);
        System.out.println("别名的调用和id的调用是否相同"+(user==aliasUser));
    }
}
