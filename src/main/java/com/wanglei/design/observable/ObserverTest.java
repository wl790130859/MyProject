package com.wanglei.design.observable;

/**
 * 测试简单的观察者模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        //添加观察者
        subject.addObserver(new OneObserver());
        subject.addObserver(new TwoObserver());
        //通知观察者
        subject.doTest();
    }
}