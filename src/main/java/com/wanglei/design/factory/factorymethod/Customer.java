package com.wanglei.design.factory.factorymethod;

/**
 * @author: wanglei
 * @description:  客户端类 当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Customer {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Producter p = factory1.createFactory();
        Factory2 factory2 = new Factory2();
        factory2.createFactory();
    }
}