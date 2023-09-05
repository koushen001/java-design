package com.cike.decorator;

/**
 * @author kou
 * 具体装饰器
 */
public class MilkDecorator implements CoffeeDecorator {

    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
