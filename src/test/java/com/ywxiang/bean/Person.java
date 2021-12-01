package com.ywxiang.bean;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.DisposableBean;
import com.ywxiang.beans.factory.InitializingBean;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class Person implements InitializingBean, DisposableBean {
    private String name;
    private Car car;

    public Person() {
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void customInitMethod() {
        System.out.println("I was born in the method named customInitMethod");
    }

    public void customDestroyMethod() {
        System.out.println("I died in the method named customDestroyMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I died in the method named destroy");
    }

    @Override
    public void afterPropertiesSet() throws BeansException {
        System.out.println("I was born in the method named afterPropertiesSet");
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
