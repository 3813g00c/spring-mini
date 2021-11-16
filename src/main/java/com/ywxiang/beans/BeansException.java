package com.ywxiang.beans;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
