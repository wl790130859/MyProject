package com.wanglei.design.observable;

public class NewObservableTest extends NewObservable {

    public void toUpdate(Object obj){
        System.out.println(System.currentTimeMillis());
        setChanged();
        notifyObserver(obj);
    }
}