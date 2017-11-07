package com.wanglei.design.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1
 */
public class OneObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg+"  "+this.getClass().getName());
    }
}