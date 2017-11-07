package com.wanglei.design.adapter;

/**
 * @author: wanglei
 * @description:  适配器模式  感觉类似与serviceIpml类中 引用其他service已经实现的方法
 * @date: 2017-10-19
 * @email: wanglei@19lou.com
 * 比如说你现在写了一个类A，要写一个排序方法A，
 * 然后用main方法来调用这个类的方法A，方法A就
 * 要写一个排序的逻辑，但是你发现你以前在类B中
 * 写过一个方法B，这个方法B完全能够满足要求，
 * 所以你决定不写了，要调用这个方法B，但是你的
 * 类A中还有其他方法都要用，你希望实例化一个类A
 * 就可以满足main方法里面所有的应用了，这个时候
 * 你用适配器模式就好了。就不用再写一遍相同的逻辑了
 */

//可以用继承类的方法   也可以用创建对象的方法
public class Adapter extends B implements A{
    @Override
    public void add() {
         this.addInB();
    }

    @Override
    public void delete() {
        this.deleteInB();
    }

    @Override
    public void update() {
        System.out.println("适配器实现A");
    }

    @Override
    public void clear() {
        System.out.println("适配器实现A");
    }
}