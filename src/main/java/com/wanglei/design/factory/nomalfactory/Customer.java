package com.wanglei.design.factory.nomalfactory;

/**
 * @author: wanglei
 * @description: 客户端类 具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createfactory(1);
        factory.createfactory(2);
    }
}