package com.wanglei.design.builder;

/**
 * @author: wanglei
 * @description:  实现创建功能
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class ManBuilder implements PersonBuilder {
    private Person person;

    public ManBuilder(){
       person = new Man();
    }

    @Override
    public void buildHead() {
         person.setHead("头");
    }

    @Override
    public void buildFoot() {
         person.setFoot("脚");
    }

    @Override
    public void buildBody() {
        person.setBody("身体");
    }

    @Override
    public Person buildPerson() {
       return person;
    }
}