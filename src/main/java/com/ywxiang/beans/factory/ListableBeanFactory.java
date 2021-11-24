package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.BeanFactory;

import java.util.Map;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 返回指定类型的所有bean实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回定义的所有bean的名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
