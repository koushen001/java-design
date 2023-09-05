package com.cike.bridge;

/**
 * @author kou
 * 桥接模式（Bridge Pattern）是一种结构型设计模式，它将抽象部分和实现部分分离，使它们可以独立地变化。桥接模式的核心思想是将两个维度的变化分离开来，从而减少类之间的耦合性。
 * 桥接模式包括以下角色：
 * 抽象部分（Abstraction）：定义抽象部分的接口，包括抽象方法和一个对实现部分的引用。
 * 具体抽象部分（Concrete Abstraction）：实现抽象部分的接口，通常继承抽象部分，并调用实现部分的方法。
 * 实现部分（Implementor）：定义实现部分的接口，包括实现方法。
 * 具体实现部分（Concrete Implementor）：实现实现部分的接口，提供具体的实现。
 * 通过桥接模式，可以使抽象部分和实现部分可以独立地变化，从而实现更好的可扩展性和灵活性。
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new ConcreteAbstractionA(implementorA);
        Abstraction abstractionB = new ConcreteAbstractionB(implementorB);

        abstractionA.operation();
        abstractionB.operation();
    }
}
