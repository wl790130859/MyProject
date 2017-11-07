package com.wanglei.design.singleton;

/**
 * @author: wanglei
 * @description: 懒汉式单例 解决并发问题 方法1 jdk5以后使用
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class Singleton21 {

    private Singleton21(){}

    /**
     * volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     * 使用volatile关键字会强制将修改的值立即写入主存
     * volatile 不保证原子性    加锁可保证
     * volatile 不能代替synchronized 原因：不保证原子性
     */

    private volatile static Singleton21 singleton = null;

    public static Singleton21 getSingleton(){
        if (singleton ==null){//此处是可能有多个线程访问的
            synchronized (Singleton21.class){
                if (singleton==null){
                    singleton = new Singleton21();  //如果有一个线程创建了 volatile 可以让其他线程都能看见
                }
            }
        }
        return singleton;
    }
}