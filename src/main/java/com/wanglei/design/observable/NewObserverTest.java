package com.wanglei.design.observable;

public class NewObserverTest implements NewObserver{

    @Override
    public void update(NewObservable o, Object msg) {
            System.out.println("进入观察者1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
             Object oo = TestObserverUntil.remove("a");
            System.out.println(oo);
            System.out.println("我是观察者1，收到消息：" + msg);
        }
}