package com.cike.builder;

/**
 * @author kou
 * 建造者模式（Builder Pattern）是一种创建型设计模式，它通过将一个复杂对象的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示。
 * 建造者模式适用于创建具有多个组成部分的复杂对象，而且这些部分之间的创建顺序和组合方式可能会发生变化。它将对象的构建细节封装在不同的建造者类中，从而使得客户端代码可以根据需要灵活地选择和配置不同的建造者，从而构建出不同的产品对象。
 * 建造者模式包括以下角色：
 * 产品（Product）：表示要构建的复杂对象。
 * 抽象建造者（Abstract Builder）：定义了构建产品的抽象方法，通常包括设置产品的各个部分。
 * 具体建造者（Concrete Builder）：实现了抽象建造者接口，负责具体的产品构建过程。
 * 指挥者（Director）：负责使用建造者来构建产品对象，它控制建造的过程。
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        Director director = new Director(gamingBuilder);
        Computer gamingComputer = director.constructComputer();

        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingComputer);
    }
}
