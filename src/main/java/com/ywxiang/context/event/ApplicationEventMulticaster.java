package com.ywxiang.context.event;

import com.ywxiang.context.ApplicationListener;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public interface ApplicationEventMulticaster {

    /**
     * 添加监听器
     * @param listener
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * 删除监听器
     *
     * @param listener
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     *
     * @param event
     */
    void multicastEvent(ApplicationEvent event);
}
