package com.wanglei.design.builder;

/**
 * @author: wanglei
 * @description:  建造者模式
 * @viewUrl: http://book.codedq.net/design-pattern/Builder.html
 * Builder 为创建一个Product对象的各个部件指定抽象接口
 * ConcreteBuilder 实现Builder的接口以构造和装配该产品的各个部件。 定义并明确它所创建的表示。 提供一个检索产品的接口
 * Director 构造一个使用Builder接口的对象
 * Product 表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程。 包含定义组成部件的类，包括将这些部件装配成最终产品的接口
 * @date: 2017-10-18
 * @email: wanglei@19lou.com
 */
public interface PersonBuilder {

    void buildHead();
    void buildFoot();
    void buildBody();
    Person buildPerson();
}
