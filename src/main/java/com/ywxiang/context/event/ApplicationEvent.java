package com.ywxiang.context.event;

import java.util.EventObject;

/**
 * @author xiangyaowei
 * @date 2021/12/1
 */
public abstract class ApplicationEvent extends EventObject {

    public ApplicationEvent(Object source) {
        super(source);
    }
}
