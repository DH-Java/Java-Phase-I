package dx.com.ioc.container;

import dx.com.ioc.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/06/19/16:37
 * @Description:作为ioc容器示例
 */
public class BeanFactoryAsIocContainerDemo {
    public static void main(String[] args) {
        //创建BeanFactory容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        String local = "classpath:/META-INF/dependency-lookup-context.xml";
        //加载配置
        int beanDefinitionsCount = xmlBeanDefinitionReader.loadBeanDefinitions(local);
        System.out.println("Bean定义加载的数量  "+beanDefinitionsCount);
        lookupCollectionType(beanFactory);

    }
    private static void lookupCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> userMap = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有User集合对象"+userMap);
        }
    }
}
