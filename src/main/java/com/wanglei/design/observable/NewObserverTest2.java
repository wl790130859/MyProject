package com.wanglei.design.observable;


import lombok.Setter;

public class NewObserverTest2 implements NewObserver {
    /**
     * 需要提供set方法
     */
    @Setter
    private NewObservable newObservable;

    public void init(){
        newObservable.addObserver(this);
    }

    @Override
    public void update(NewObservable o, Object msg) {

           /*当有两个同时进来时 remove得到null 这是不允许的 发生了并发*/
           /*处理并发：用多线程*/
           System.out.println("进入观察者2");
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {

           }
           Object oo = TestObserverUntil.remove("a");
           System.out.println(oo);
           System.out.println("方法2:观察者收到消息："+msg);
       }

}