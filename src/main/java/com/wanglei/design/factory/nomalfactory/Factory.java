package com.wanglei.design.factory.nomalfactory;

/**
 * @author: wanglei
 * @description: 工厂类   工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Factory {
    //每增加一个产品 都要再工厂类中新添加一个创建业务逻辑 违背了开闭原则 工厂方法类可以解决
    public Producter createfactory(int type){
        switch (type){
            case 1:
                return new Product1();
            case 2:
                return new Product2();
             default:
                 break;
        }
        return null;
    }
}
