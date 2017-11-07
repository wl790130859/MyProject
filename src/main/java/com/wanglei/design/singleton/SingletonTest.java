package com.wanglei.design.singleton;

/**
 * @author: wanglei
 * @description:
 * @date: 2017-10-17
 * @email: wanglei@19lou.com
 */
public class SingletonTest {
    public static void main(String[] args) {
        //单例 可不用new对象 直接访问非静态方法
      Singleton s = Singleton.getSingleton();
      Singleton2 s2 = Singleton2.getSingleton();
      s.testSingleton();
      s2.testSingleton();
    }
}