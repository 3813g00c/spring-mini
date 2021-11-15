package com.ywxiang.factory.config;

/**
 *保存Bean的信息，包括class类型，方法构造参数，是否为单例，此处简化为只包含Class类型
 *
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
