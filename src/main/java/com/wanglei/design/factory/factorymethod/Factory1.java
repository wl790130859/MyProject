package com.wanglei.design.factory.factorymethod;

/**
 * @author: wanglei
 * @description: 工厂1
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Factory1 implements Factory {
    @Override
    public Producter createFactory() {
        return new Product1();
    }
}