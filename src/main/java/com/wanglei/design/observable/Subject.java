package com.wanglei.design.observable;

import java.util.Observable;

/**
 * 一个简单的例子
 * 被观察者
 * http://book.codedq.net/design-pattern/Observer.html
 */
public class Subject extends Observable {
    //通知观察者
    public void doTest() {
        setChanged();  //状态改变
        //这个方法触发观察者
        notifyObservers("你好观察者");//通知观察者消息
    }
}