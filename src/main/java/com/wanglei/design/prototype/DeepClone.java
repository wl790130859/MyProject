package com.wanglei.design.prototype;

import java.io.*;

/**
 * @author: wanglei
 * @description: 深克隆 实现Serializable接口 用对象输出输入流来复制
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class DeepClone implements Serializable {
    String name;
    int age;
    Prototype prototype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public DeepClone(){}

    public DeepClone(String name, int age, Prototype prototype) {
        this.name = name;
        this.age = age;
        this.prototype = prototype;
    }

    public Object deepClone() throws Exception{
        //将对象写进流
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将流读出来
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}