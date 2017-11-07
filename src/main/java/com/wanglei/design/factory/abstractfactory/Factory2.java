package com.wanglei.design.factory.abstractfactory;

/**
 * @author: wanglei
 * @description:
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Factory2 implements Factory {
    @Override
    public Producter1 createFactory1() {
        return new Product12();
    }

    @Override
    public Producter2 createFactory2() {
        return new Product22();
    }
}