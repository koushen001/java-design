package com.cike.flyweight;

/**
 * @author kou
 * 享元模式（Flyweight Pattern）是一种结构型设计模式，它旨在减少内存使用和提高性能，通过共享对象来减少创建多个相似对象的开销。享元模式适用于存在大量相似对象的场景，通过共享内部状态来减少内存消耗。
 * 享元模式的核心思想是：将对象的状态分为内部状态和外部状态。内部状态可以被共享，而外部状态是会变化的，需要通过参数传递给对象。通过共享内部状态，可以减少内存消耗。
 * 享元模式包括以下角色：
 * 享元（Flyweight）：定义共享对象的接口，包括接受外部状态作为参数的方法。
 * 具体享元（Concrete Flyweight）：实现享元接口，包括共享内部状态和接受外部状态的方法。
 * 享元工厂（Flyweight Factory）：管理共享对象的工厂，维护一个享元池，用于创建和获取共享对象。
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("External state 1");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("External state 2");

        Flyweight flyweight3 = factory.getFlyweight("A");
        flyweight3.operation("External state 3");

        System.out.println(flyweight1 == flyweight3);
    }
}
