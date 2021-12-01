package com.ywxiang.context;

import com.ywxiang.beans.BeansException;
import com.ywxiang.beans.factory.Aware;

/**
 * @author xiangyaowei
 * @date 2021/11/30
 */
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
