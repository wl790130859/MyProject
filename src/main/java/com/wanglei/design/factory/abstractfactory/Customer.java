package com.wanglei.design.factory.abstractfactory;

/**
 * @author: wanglei
 * @description:
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Customer {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Factory2 factory2 = new Factory2();
        factory1.createFactory1();
        factory1.createFactory2();
        factory2.createFactory1();
        factory2.createFactory2();
    }
}