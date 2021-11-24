package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.config.AutowireCapableBeanFactory;
import com.ywxiang.beans.factory.config.BeanDefinition;
import com.ywxiang.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
