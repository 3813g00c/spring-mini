package com.ywxiang.beans.factory.support;

import com.ywxiang.beans.BeansException;
import com.ywxiang.core.io.Resource;
import com.ywxiang.core.io.ResourceLoader;

/**
 * @author xiangyaowei
 * @date 2021/11/23
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;
}
