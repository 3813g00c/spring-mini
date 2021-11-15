package com.ywxiang.support;

import com.ywxiang.BeansException;
import com.ywxiang.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            Constructor declaredConstructor = beanClass.getDeclaredConstructor();
            return declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
