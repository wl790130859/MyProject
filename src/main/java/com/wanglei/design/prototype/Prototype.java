package com.wanglei.design.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: wanglei
 * @description: 原型模式用于类的复制    http://book.codedq.net/design-pattern/Prototype.html
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class Prototype implements Cloneable,Serializable{
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int age;
    @Setter
    @Getter
    private String[] s;

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (Exception e) {
        }
        return prototype;
    }
}