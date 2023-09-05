package com.cike.decorator;

/**
 * @author kou
 * 具体组件
 */
public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
