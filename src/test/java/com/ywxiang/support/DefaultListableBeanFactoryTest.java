package com.ywxiang.support;

import com.ywxiang.PropertyValue;
import com.ywxiang.PropertyValues;
import com.ywxiang.factory.config.BeanDefinition;
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

}