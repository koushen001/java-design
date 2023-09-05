package com.cike.iterator;

/**
 * @author kou
 * 迭代器模式（Iterator Pattern）是一种行为型设计模式，它提供了一种顺序访问集合对象元素的方法，而不需要暴露集合的内部结构。迭代器模式允许你在不知道集合底层实现的情况下遍历集合中的元素。
 * 迭代器模式包含以下关键角色：
 * Iterator（迭代器）：定义了访问和遍历元素的接口，通常包括 hasNext（是否还有下一个元素）和 next（获取下一个元素）等方法。
 * ConcreteIterator（具体迭代器）：实现了 Iterator 接口，负责实际遍历集合并跟踪当前位置。
 * Aggregate（集合）：定义了创建迭代器对象的接口，通常包括一个 createIterator 方法。
 * ConcreteAggregate（具体集合）：实现了 Aggregate 接口，负责创建具体的迭代器对象。
 */
public class Client {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        Aggregate<String> aggregate = new ConcreteAggregate<>(names);
        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
