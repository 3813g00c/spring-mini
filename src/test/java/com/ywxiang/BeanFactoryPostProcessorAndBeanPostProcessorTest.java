package com.ywxiang;

import com.ywxiang.bean.Car;
import com.ywxiang.bean.Person;
import com.ywxiang.beans.factory.support.DefaultListableBeanFactory;
import com.ywxiang.beans.factory.xml.XmlBeanDefinitionReader;
import com.ywxiang.common.CustomBeanFactoryPostProcessor;
import com.ywxiang.common.CustomerBeanPostProcessor;
import org.junit.Test;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public class BeanFactoryPostProcessorAndBeanPostProcessorTest {
    @Test
    public void testBeanFactoryPostProcessor() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //在所有BeanDefintion加载完成后，但在bean实例化之前，修改BeanDefinition的属性值
        CustomBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        //name属性在CustomBeanFactoryPostProcessor中被修改为ivy
    }

    @Test
    public void testBeanPostProcessor() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        //添加bean实例化后的处理器
        CustomerBeanPostProcessor customerBeanPostProcessor = new CustomerBeanPostProcessor();
        beanFactory.addBeanPostProcessor(customerBeanPostProcessor);

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        //brand属性在CustomerBeanPostProcessor中被修改为lamborghini
    }
}
