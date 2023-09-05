package com.cike.abstractfactory;

/**
 * @author kou
 * 抽象工厂模式（Abstract Factory Pattern）是一种创建型设计模式，它提供了一个接口，用于创建一系列相关或相互依赖的对象，而无需指定其具体类。抽象工厂模式的目标是将一组相关的产品对象的创建从客户端代码中分离出来，以实现高内聚、低耦合的设计。
 * 主要组成部分：
 * 抽象工厂（Abstract Factory）： 定义了一组创建相关产品的接口，包括创建不同类型产品的方法。
 * 具体工厂（Concrete Factory）： 实现了抽象工厂接口，负责创建一组具体的产品对象。
 * 抽象产品（Abstract Product）： 定义了一组相关产品的接口，每个具体产品类都要实现这些接口。
 * 具体产品（Concrete Product）： 实现了抽象产品接口，由具体工厂创建。
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape();
        Color color = shapeFactory.createColor();
        shape.draw();
        color.fill();

        AbstractFactory colorFactory = new ColorFactory();
        Shape anotherShape = colorFactory.createShape();
        Color anotherColor = colorFactory.createColor();
        anotherShape.draw();
        anotherColor.fill();
    }
}
