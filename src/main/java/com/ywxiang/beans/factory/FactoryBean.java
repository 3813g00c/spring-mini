package com.ywxiang.beans.factory;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;

    boolean isSingleton();
}
