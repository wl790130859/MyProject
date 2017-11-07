package com.wanglei.design.prototype;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author: wanglei
 * @description: 类的复制也可用BeanCopier
 * 介绍深克隆和浅克隆 http://blog.csdn.net/goskalrie/article/details/50790056
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception{
        Prototype p = new CreatePrototype();
        p.setName("张三");
        //**************************简单的复制 当修改p2的时候 p也跟着修改了
        Prototype p2 = p;
        System.out.println(p==p2);//true
        System.out.println(p2.getName());
        p2.setName("小王");
        System.out.println(p.getName()); // 小王
        System.out.println(p2.getName()); // 小王
        //********************************

        //**************************克隆 重写clone方法  浅拷贝
        Prototype p3 = new CreatePrototype();
        p3.setName("李四");
        Prototype p4 = p3.clone();
        System.out.println(p3 == p4);//false
        System.out.println(p3.getName() == p4.getName()); //true 两个对象name的地址一样  浅拷贝
        System.out.println(p4.getName());
        p4.setName("王五");
        System.out.println(p3.getName());//李四
        System.out.println(p4.getName());//王五
        //********************************

        //S****************************深克隆
        DeepClone deepClone = new DeepClone("zhangsan", 12, p3);
        DeepClone cloneDeep = (DeepClone) deepClone.deepClone();
        System.out.println(deepClone.getName()); //zhangsan
        System.out.println(cloneDeep.getName()); //zhangsan
        System.out.println(deepClone);
        System.out.println(cloneDeep);
        System.out.println(cloneDeep.getPrototype().getName()); //李四
        System.out.println(cloneDeep.getName() == deepClone.getName());//false 此处name指针已经只想另一处
        cloneDeep.setName("lisi");
        System.out.println(deepClone.getName()); //zhangsan
        System.out.println(cloneDeep.getName()); //lisi
        //E******************************

        BeanCopier copier;
        DeepClone deepCopier = new DeepClone();//需要创建对象 而且还是浅克隆
        copier = BeanCopier.create(deepClone.getClass(),deepCopier.getClass(),false);
        copier.copy(deepClone,deepCopier,null);
        System.out.println(deepClone);
        System.out.println(deepCopier);
        System.out.println(deepClone.getName() == deepCopier.getName()); //true
    }
}