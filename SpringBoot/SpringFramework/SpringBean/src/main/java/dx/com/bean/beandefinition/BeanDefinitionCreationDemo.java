package dx.com.bean.beandefinition;

import dx.com.ioc.entity.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/07/01/9:34
 * @Description:
 */
public class BeanDefinitionCreationDemo {
    public static void main(String[] args) {
        /**
         * @Description: 通过BeanDefinitionBuilder 构建
         * @Param: [args]
         * @return: [java.lang.String[]]
         * @Date: 2022/7/1
         */
        //1、通过BeanDefinitionBuilder 构建
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        // 通过属性设置
        beanDefinitionBuilder
                .addPropertyValue("id", 1)
                .addPropertyValue("name", "刘德华");
        // 获取BeanDefinition 实例
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        // BeanDefinition 并非Bean终态，可以自定义修改

        /**
        * @Description: 通过AbstractBeanDefinition 以及派生类
        * @Param: [args]
        * @return: [java.lang.String[]]
        * @Date: 2022/7/1
        */
        //2、通过AbstractBeanDefinition 以及派生类
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        // 设置Bean类型
        genericBeanDefinition.setBeanClass(User.class);
        // 通过 MutablePropertyValues 批量属性操作
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues
                .add("id", 1)
                .add("name", "刘德华");
        // 通过set MutablePropertyValues 批量属性操作
        genericBeanDefinition.setPropertyValues(propertyValues);
    }


}
