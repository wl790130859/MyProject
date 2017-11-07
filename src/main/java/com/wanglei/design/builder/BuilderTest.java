package com.wanglei.design.builder;

/**
 * @author: wanglei
 * @description: 测试类
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class BuilderTest {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person p = personDirector.createPerson(new ManBuilder());
        System.out.println(p.toString());
    }
}