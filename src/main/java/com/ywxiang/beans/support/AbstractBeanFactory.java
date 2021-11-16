package com.ywxiang.beans.support;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.BeanFactory;
import com.ywxiang.beans.factory.config.BeanDefinition;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = getSingleton(beanName);
        if (null != bean) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
