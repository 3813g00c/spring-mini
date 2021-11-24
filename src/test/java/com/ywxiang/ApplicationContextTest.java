package com.ywxiang;

import com.ywxiang.bean.Car;
import com.ywxiang.bean.Person;
import com.ywxiang.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public class ApplicationContextTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
    }
}
