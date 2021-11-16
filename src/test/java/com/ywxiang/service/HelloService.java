package com.ywxiang.service;

/**
 * @author xiangyaowei
 * @date 2021/11/15
 */
public class HelloService {
    private String a;
    private String b;

    public HelloService() {}
    public HelloService(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void hello() {
        System.out.println("hello" + a + b);
    }
}
