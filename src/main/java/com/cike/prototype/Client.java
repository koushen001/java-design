package com.cike.prototype;

/**
 * @author kou
 * 原型模式（Prototype Pattern）是一种创建型设计模式，它允许通过复制现有对象来创建新的对象，而无需通过构造函数创建新实例。原型模式在需要创建多个相似对象时非常有用，尤其是当对象的创建过程比较复杂或代价较大时。
 * 原型模式的核心思想是：通过原型对象创建新的对象，而不是通过构造函数。原型对象充当了模板的角色，新对象通过克隆原型对象来获得初始状态。
 * 原型模式包括以下角色：
 * 原型（Prototype）：声明克隆自身的方法。
 * 具体原型（Concrete Prototype）：实现原型接口，实现克隆自身的方法。
 * 客户端（Client）：使用原型对象的客户端代码，通过克隆原型来创建新的对象。
 */
public class Client {
    public static void main(String[] args) {
        // 创建原型对象
        Prototype prototype = new ConcretePrototype("Prototype 1");

        // 克隆原型对象
        Prototype clone1 = prototype.clone();
        Prototype clone2 = prototype.clone();

        System.out.println(clone1);
        System.out.println(clone2);
    }
}
