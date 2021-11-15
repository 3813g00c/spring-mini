package com.ywxiang.support;

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

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("helloService" ,beanDefinition);
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.hello();
    }

}