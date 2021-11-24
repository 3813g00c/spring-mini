package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.AutowireCapableBeanFactory;
import com.ywxiang.beans.factory.config.BeanDefinition;
import com.ywxiang.beans.factory.config.BeanPostProcessor;
import com.ywxiang.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 提前实例化所有单例实例
     *
     * @throws BeansException
     */
    void preInstantiateSingleton() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor postProcessor);
}
