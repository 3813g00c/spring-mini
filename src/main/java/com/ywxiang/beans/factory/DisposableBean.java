package com.ywxiang.beans.factory;

/**
 * @author xiangyaowei
 * @date 2021/11/25
 */
public interface DisposableBean {
    void destroy() throws Exception;
}
