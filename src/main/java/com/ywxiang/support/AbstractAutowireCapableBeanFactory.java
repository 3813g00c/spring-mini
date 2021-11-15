package com.ywxiang.support;

import com.ywxiang.BeansException;
import com.ywxiang.factory.config.BeanDefinition;

import java.lang.reflect.InvocationTargetException;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        return doCreateBean(beanName, beanDefinition);
    }

    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) {
        return getInstantiationStrategy().instantiate(beanDefinition);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
