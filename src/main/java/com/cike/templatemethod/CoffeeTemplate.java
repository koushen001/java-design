package com.cike.templatemethod;

/**
 * @author kou
 * 抽象模板类
 */
public abstract class CoffeeTemplate {
    // 模板方法，定义了制作咖啡的步骤
    public final void prepareCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
        System.out.println("咖啡已准备好");
    }

    // 抽象方法，由子类实现
    protected abstract void brewCoffeeGrinds();

    // 抽象方法，由子类实现
    protected abstract void addCondiments();

    // 具体方法，父类提供默认实现
    private void boilWater() {
        System.out.println("烧水");
    }

    // 具体方法，父类提供默认实现
    private void pourInCup() {
        System.out.println("倒入杯中");
    }
}
