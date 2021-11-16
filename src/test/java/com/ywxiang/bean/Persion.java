package com.ywxiang.bean;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class Persion {
    private String name;
    private Car car;

    public Persion() {}

    public Persion(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
