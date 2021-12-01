package com.ywxiang.beans.factory.config;

import com.ywxiang.beans.factory.HierarchicalBeanFactory;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁bean
     */
    void destroySingletons();
}
