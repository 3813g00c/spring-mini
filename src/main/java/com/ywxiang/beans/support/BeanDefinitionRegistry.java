package com.ywxiang.beans.support;

import com.ywxiang.beans.factory.config.BeanDefinition;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
