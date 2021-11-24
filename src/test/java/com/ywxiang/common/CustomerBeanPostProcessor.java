package com.ywxiang.common;

import com.ywxiang.bean.Car;
import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.BeanPostProcessor;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessBeforeInitialization");
        if ("car".equals(beanName)) {
            ((Car) bean).setName("lamborghini");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
