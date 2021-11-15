package com.ywxiang.factory;

import com.ywxiang.BeansException;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
}
