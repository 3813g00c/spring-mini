package com.ywxiang.support;

import com.ywxiang.BeansException;
import com.ywxiang.factory.config.BeanDefinition;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
