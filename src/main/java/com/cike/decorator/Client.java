package com.cike.decorator;

/**
 * @author kou
 * 装饰器模式（Decorator Pattern）是一种结构型设计模式，它允许你动态地将行为添加到对象中，而不会影响其它对象的行为。装饰器模式通过将对象包装在一个装饰器类中，可以在运行时为对象添加新的功能或行为。
 * 装饰器模式的核心思想是：使用不同的装饰器来包装具体组件（被装饰的对象），从而实现不同的功能组合。装饰器类和具体组件类都实现同一个接口，使得装饰器和具体组件可以互换使用。
 * 装饰器模式包括以下角色：
 * 组件（Component）：定义被装饰对象的接口，可以是抽象类或接口。
 * 具体组件（Concrete Component）：实现组件接口的具体类，是被装饰的对象。
 * 装饰器（Decorator）：维持一个指向具体组件的引用，并实现与组件接口一致的接口。
 * 具体装饰器（Concrete Decorator）：实现装饰器接口的具体类，负责为具体组件添加新的功能。
 */
public class Client {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Description: " + simpleCoffee.getDescription() + ", Cost: $" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Description: " + milkCoffee.getDescription() + ", Cost: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Description: " + sugarMilkCoffee.getDescription() + ", Cost: $" + sugarMilkCoffee.cost());
    }
}
