package com.ywxiang;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiangyaowei
 * @date 2021/9/18
 */
public class BeanFactoryTest {

    @Test
    public void registerBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertNotNull(helloService);
        assertEquals(helloService.sayHello(), "hello");
    }

    @Test
    public void getBean() {
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}