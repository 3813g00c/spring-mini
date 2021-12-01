package com.ywxiang.common;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.PropertyValue;
import com.ywxiang.beans.PropertyValues;
import com.ywxiang.beans.factory.ConfigurableListableBeanFactory;
import com.ywxiang.beans.factory.config.BeanDefinition;
import com.ywxiang.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author xiangyaowei
 * @date 2021/11/24
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefiniton = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefiniton.getPropertyValues();
        //将person的name属性改为ivy
        propertyValues.addPropertyValue(new PropertyValue("name", "ivy"));
    }
}
