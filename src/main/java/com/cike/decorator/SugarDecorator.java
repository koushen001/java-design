package com.cike.decorator;

/**
 * @author kou
 * 具体装饰器
 */
public class SugarDecorator implements CoffeeDecorator{
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.3;
    }
}
