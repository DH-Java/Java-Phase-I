package dx.com.bean.beandefinition;

import dx.com.ioc.entity.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/07/01/10:41
 * @Description:
 */

/**
 * @author 67636
 * @Description: 3、通过@Import 方式
 * @Param:
 * @return:
 * @Date: 2022/7/1
 */
@Import(AnnotationBeanDefinitionDemo.Config.class)
public class AnnotationBeanDefinitionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //注册配置类
        applicationContext.register(AnnotationBeanDefinitionDemo.class);
        // 通过BeanDefinition 注册Api 实现
        //1、命名Bean 的注册方式
        registerUserBeanDefinition(applicationContext, "javaApi-user");
        //2、 非命名 Bean 的注册方式
        registerUserBeanDefinition(applicationContext);
        //启动应用上下文
        applicationContext.refresh();

        //按照类型依赖查找
        System.out.println("Config 类型的所有bean" + applicationContext.getBeansOfType(Config.class));
        System.out.println("user 类型的所有bean" + applicationContext.getBeansOfType(User.class));

        applicationContext.close();
    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry, String beanName) {
        BeanDefinitionBuilder beanDefinitionBuilder = genericBeanDefinition(User.class);
        beanDefinitionBuilder
                .addPropertyValue("id", 1L)
                .addPropertyValue("name", "刘德华");

        //判断如果，beanName 参数存在时
        if (StringUtils.hasText(beanName)) {
            //注册 BeanDefinition
            registry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
        } else {
            //非命名 Bean 注册方式
            BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), registry);
        }

    }

    //重载
    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry) {
        registerUserBeanDefinition(registry, null);
    }

    /**
     * @Description: 2、通过@Component 方式
     * @Param:
     * @return:
     * @Date: 2022/7/1
     */
    @Component
    public static class Config {
        //1、通过@Bean方式定义
        @Bean
        public User user() {
            User user = new User();
            user.setId(1L);
            user.setName("刘德华");
            return user;
        }
    }
}


