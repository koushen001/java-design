package com.cike.visitor;

/**
 * @author kou
 * 访问者模式（Visitor Pattern）是一种行为型设计模式，用于在不改变被访问对象的类的前提下，为对象结构中的各元素提供访问操作。它将数据结构与数据操作分离，使得可以在不修改数据结构的情况下增加新的操作。
 * 访问者模式的关键角色包括：
 * 访问者（Visitor）：定义了可以访问和操作每个具体元素的方法。访问者接口通常包含多个 visit 方法，每个方法对应一个具体元素类。
 * 具体访问者（Concrete Visitor）：实现了访问者接口的具体类，负责实现对具体元素的访问操作。
 * 元素（Element）：定义了一个 accept 方法，该方法接受一个访问者作为参数，使访问者能够访问自己。
 * 具体元素（Concrete Element）：实现了元素接口的具体类，通常包含一个 accept 方法的实现。
 * 对象结构（Object Structure）：包含了多个元素，可以是一个集合或组合结构，用于维护元素的集合。
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Visitor visitor = new ConcreteVisitor();

        objectStructure.accept(visitor);
    }
}
