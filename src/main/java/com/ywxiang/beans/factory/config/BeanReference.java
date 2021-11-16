package com.ywxiang.beans.factory.config;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
