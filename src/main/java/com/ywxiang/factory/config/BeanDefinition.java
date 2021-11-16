package com.ywxiang.factory.config;

import com.ywxiang.PropertyValues;

/**
 *保存Bean的信息，包括class类型，方法构造参数，是否为单例，此处简化为只包含Class类型
 *
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class BeanDefinition {
    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
