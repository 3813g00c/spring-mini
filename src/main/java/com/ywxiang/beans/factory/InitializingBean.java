package com.ywxiang.beans.factory;

import com.ywxiang.beans.BeansException;

/**
 * @author xiangyaowei
 * @date 2021/11/25
 */
public interface InitializingBean {
    void afterPropertiesSet() throws BeansException;
}
