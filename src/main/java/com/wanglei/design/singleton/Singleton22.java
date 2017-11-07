package com.wanglei.design.singleton;

/**
 * @author: wanglei
 * @description:  懒汉式单例 解决并发问题 方法2 不考虑jdk版本
 * 方法2： 使用java的静态内部类
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 *
 * 介绍：在这一版本的单例模式实现代码中，我们使用了Java的静态内部类。
 * 这一技术是被JVM明确说明了的，因此不存在任何二义性。在这段代码中，
 * 因为SingletonClass没有static的属性，因此并不会被初始化。直到调
 * 用getInstance()的时候，会首先加载SingletonClassInstance类，这
 * 个类有一个static的SingletonClass实例，因此需要调用SingletonClass的
 * 构造方法，然后getInstance()将把这个内部类的instance返回给使用者。
 * 由于这个instance是static的，因此并不会构造多次。
 * 由于SingletonClassInstance是私有静态内部类，所以不会被其他类知道，
 * 同样，static语义也要求不会有多个实例存在。并且，JSL规范定义，
 * 类的构造必须是原子性的，非并发的，因此不需要加同步块。同样，
 * 由于这个构造是并发的，所以getInstance()也并不需要加同步。
 */
public class Singleton22 {

    private static class SingletonClassInstance{
        private static final Singleton22  singleton = new Singleton22();
    }

    public static Singleton22 getSingleton(){
       return SingletonClassInstance.singleton;
    }
}