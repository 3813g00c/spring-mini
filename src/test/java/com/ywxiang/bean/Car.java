package com.ywxiang.bean;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 *
*/

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }


}
