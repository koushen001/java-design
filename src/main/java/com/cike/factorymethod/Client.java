package com.cike.factorymethod;

/**
 * @author kou
 * 工厂方法模式（Factory Method Pattern）是一种创建型设计模式，它提供了一种将对象的实例化延迟到子类的方法。该模式定义了一个用于创建对象的接口，但将具体的对象创建交由子类来实现。这样可以将客户端代码与具体的类解耦，使得系统更加灵活，易于扩展和维护。
 * 主要组成部分：
 * 抽象工厂（Creator）： 定义了一个创建对象的工厂方法接口，通常是一个抽象类，可以包含一些公共的逻辑。
 * 具体工厂（Concrete Creator）： 继承或实现抽象工厂，实现了工厂方法，用于创建具体的产品对象。
 * 抽象产品（Product）： 定义了产品的接口，可以是抽象类或接口。
 * 具体产品（Concrete Product）： 实现了抽象产品的接口，由具体工厂创建。
 */
public class Client {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();
    }
}
