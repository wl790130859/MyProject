package com.wanglei.design.singleton;

/**
 * @author: wanglei
 * @description: 单例模式  饿汉式 构造器私有化 在类中创建一个本类对象 提供一个方法可以获取到该对象
 *  single类一进内存就已经创建好了对象
 *  自我感觉：单例用在只读类中好一点  比如初始化配置文件
 *  spring容器加载bean的时候 默认使用单例创建
 *  一般用饿汉式 安全  但如果该类不被使用，初始化就浪费了资源
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Singleton {
    private Singleton(){}
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }

    public void testSingleton(){
        System.out.println("通过单例来调用类中的普通方法");
    }
}