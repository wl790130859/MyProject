package com.wanglei.design.adapter;

/**
 * @author: wanglei
 * @description:
 * @date: 2017-10-19
 * @email: wanglei@19lou.com
 */
public class AdapterTest {
    /**
     * 实例化一个类A
     * 就可以满足main方法里面所有的应用了
     * @param a
     */
    public static void testOperation(A a) {
         a.add();
         a.delete();
         a.update();
         a.clear();
    }

    public static void main(String[] args) {
        testOperation(new Adapter());
    }

}