package com.wanglei.design.factory.factorymethod;

/**
 * @author: wanglei
 * @description: 工厂2
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Factory2 implements Factory {
    @Override
    public Producter createFactory() {
        return new Product2();
    }
}