package com.cike.composite;

/**
 * @author kou
 * 组合模式（Composite Pattern）是一种结构型设计模式，它允许你将对象组合成树形结构以表示“整体-部分”层次结构。组合模式使得客户端对单个对象和组合对象的使用具有一致性，从而可以简化客户端代码。
 * 组合模式的核心思想是：将叶子对象和组合对象看作是同一类型的对象，都实现同一个抽象类或接口。这样，客户端代码无需知道当前处理的是单个对象还是组合对象，可以统一地处理。
 * 组合模式包括以下角色：
 * 组件（Component）：定义组合中对象的通用接口，包括叶子对象和组合对象的操作。
 * 叶子（Leaf）：实现组件接口的叶子对象，表示组合中的基本对象。
 * 组合（Composite）：实现组件接口的组合对象，可以包含其他组合对象或叶子对象。
 */
public class Client {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite();
        composite2.add(leaf3);

        Composite root = new Composite();
        root.add(composite1);
        root.add(composite2);

        root.operation();
    }
}
