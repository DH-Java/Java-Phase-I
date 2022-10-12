package dx.com.ioc.container;

import dx.com.ioc.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/06/19/16:37
 * @Description:注解能力作为Ioc容器示例
 */
public class AnnotationApplicationContextAsIocContainerDemo {
    public static void main(String[] args) {
        //创建BeanFactory容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //把当前类 AnnotationApplicationContextAsIocContainerDemo 作为配置类（Configuration Class）
        applicationContext.register(AnnotationApplicationContextAsIocContainerDemo.class);
        //启动应用上下文
        applicationContext.refresh();
        lookupCollectionType(applicationContext);
    }
    /**
    * @Description: 通过Java注解的方式，定义一个bean
    * @Param: []
    * @return: []
    * @Date: 2022/6/19
    */
    @Bean
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("刘德华");
        return user;
    }
    private static void lookupCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> userMap = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有User集合对象"+userMap);
        }
    }
}
