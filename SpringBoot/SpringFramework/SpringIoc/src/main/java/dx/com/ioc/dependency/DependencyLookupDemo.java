package dx.com.ioc.dependency;

import dx.com.ioc.annotation.Super;
import dx.com.ioc.entity.SuperUser;
import dx.com.ioc.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/06/19/11:29
 * @Description:根据名称依赖查找示例
 */
public class DependencyLookupDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        //按照注解查找
        lookupAnnotationType(beanFactory);
        //按照类型查找
        lookupType(beanFactory);
        //按照集合类型查找
        lookupCollectionType(beanFactory);
        lookupInRealTime(beanFactory);
        lookupInLazy(beanFactory);
    }

    private static void  lookupAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> userMap = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("查找到标准Super注解的所有User集合对象"+userMap);
        }
    }

    private static void lookupCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> userMap = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有User集合对象"+userMap);
        }
    }

    private static void lookupType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("根据类型查找"+user);
    }

    private static void lookupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory =(ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User object = objectFactory.getObject();
        System.out.println("延时查找"+object);
    }

    private static void lookupInRealTime(BeanFactory beanFactory) {
        User user =(User)beanFactory.getBean("user");
        System.out.println("实时查找"+user);
    }

}
