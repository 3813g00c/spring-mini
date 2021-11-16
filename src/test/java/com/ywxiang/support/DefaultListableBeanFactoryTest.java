package com.ywxiang.support;

import com.ywxiang.PropertyValue;
import com.ywxiang.PropertyValues;
import com.ywxiang.bean.Car;
import com.ywxiang.bean.Persion;
import com.ywxiang.factory.config.BeanDefinition;
import com.ywxiang.factory.config.BeanReference;
import com.ywxiang.service.HelloService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class DefaultListableBeanFactoryTest {

    @Test
    public void test() {
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        PropertyValue propertyValue = new PropertyValue("a", "a");
        PropertyValue propertyValue1 = new PropertyValue("b", "b");
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(propertyValue);
        propertyValues.addPropertyValue(propertyValue1);
        beanDefinition.setPropertyValues(propertyValues);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("helloService" ,beanDefinition);
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.hello();
    }

    @Test
    public void populateBean() {
        BeanDefinition beanDefinition = new BeanDefinition(Car.class);
        PropertyValue propertyValue = new PropertyValue("name", "奔驰");
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(propertyValue);
        beanDefinition.setPropertyValues(propertyValues);

        BeanDefinition beanDefinition1 = new BeanDefinition(Persion.class);
        PropertyValue propertyValue1 = new PropertyValue("name", "张三");
        BeanReference beanReference = new BeanReference("car");
        PropertyValue propertyValue2 = new PropertyValue("car", beanReference);
        PropertyValues propertyValues1 = new PropertyValues();
        propertyValues1.addPropertyValue(propertyValue1);
        propertyValues1.addPropertyValue(propertyValue2);
        beanDefinition1.setPropertyValues(propertyValues1);
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();


        beanFactory.registerBeanDefinition("car" , beanDefinition);
        beanFactory.registerBeanDefinition("person" ,beanDefinition1);

        Persion p = (Persion)beanFactory.getBean("person");
        System.out.println(p);

    }

}