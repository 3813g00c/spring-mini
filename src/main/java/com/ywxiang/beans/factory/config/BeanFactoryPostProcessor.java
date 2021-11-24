package com.ywxiang.beans.factory.config;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有BeanDefinition加载完成，在Bean初始化之前，提供修改BeanDefinition属性修改机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
