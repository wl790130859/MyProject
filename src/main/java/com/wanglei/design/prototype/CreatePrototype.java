package com.wanglei.design.prototype;

/**
 * @author: wanglei
 * @description:
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class CreatePrototype extends Prototype {
    public CreatePrototype(){
        setS(new String[]{"1","2"});
    }

    public void show() {
        System.out.println("测试");
    }
}