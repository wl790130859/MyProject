package com.wanglei.service;

import com.wanglei.design.observable.NewObservableTest;
import com.wanglei.test.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestNewObserverable extends BaseJunit4Test {
    @Autowired
    private NewObservableTest newObservebleTest;

    @Test
    public void test(){
        newObservebleTest.toUpdate("你好，我是被观察者");
    }
}