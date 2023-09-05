package com.cike.templatemethod;

/**
 * @author kou
 * 模板方法模式（Template Method Pattern）是一种行为型设计模式，它定义了一个算法的骨架，将算法中的某些步骤延迟到子类中实现。模板方法模式允许在不改变算法整体结构的情况下，通过子类来重新定义某些步骤的具体实现。
 * 模板方法模式的核心思想是将算法的不变部分放在父类中，而将可变部分交由子类来实现。这样可以确保算法的整体结构在父类中保持稳定，而具体的实现可以在子类中根据需要进行扩展和定制。
 * 模板方法模式的关键角色包括：
 * 抽象模板类（Abstract Template）：抽象模板类定义了算法的骨架，其中包含了一系列抽象方法和具体方法。抽象方法通常用于延迟到子类实现，而具体方法在父类中提供默认实现。
 * 具体模板类（Concrete Template）：具体模板类继承自抽象模板类，实现了抽象方法，完成了算法的具体实现。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作牛奶咖啡：");
        CoffeeTemplate coffeeWithMilk = new CoffeeWithMilk();
        coffeeWithMilk.prepareCoffee();

        System.out.println("\n制作黑咖啡：");
        CoffeeTemplate blackCoffee = new BlackCoffee();
        blackCoffee.prepareCoffee();
    }
}
