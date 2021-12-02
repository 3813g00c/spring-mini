package com.ywxiang.context;

import com.ywxiang.context.event.ApplicationEvent;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public interface ApplicationEventPublisher {

    /**
     * 发布事件
     *
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
