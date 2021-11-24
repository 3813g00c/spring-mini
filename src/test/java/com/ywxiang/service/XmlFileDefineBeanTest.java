package com.ywxiang.service;

import com.ywxiang.bean.Car;
import com.ywxiang.bean.Person;
import com.ywxiang.beans.factory.support.DefaultListableBeanFactory;
import com.ywxiang.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public class XmlFileDefineBeanTest {
    @Test
    public void testXml() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
    }
}
