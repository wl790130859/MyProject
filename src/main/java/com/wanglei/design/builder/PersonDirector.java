package com.wanglei.design.builder;

/**
 * @author: wanglei
 * @description: 创建过程
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class PersonDirector {

    public Person createPerson(ManBuilder manBuilder){
            manBuilder.buildHead();
            manBuilder.buildFoot();
            manBuilder.buildBody();
            return manBuilder.buildPerson();
    }
}