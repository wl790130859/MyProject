package com.wanglei.design.singleton;

/**
 * @author: wanglei
 * @description: 懒汉式 单例    对象是方法被调用时才初始化，也叫作对象的延迟加载
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton = null;
    //这种方法可能存在并发
    public static Singleton2 getSingleton(){
        if (singleton==null){
            singleton =  new Singleton2();
        }
        return singleton;
    }
    public void testSingleton(){
        System.out.println("通过单例来调用类中的普通方法");
    }
}