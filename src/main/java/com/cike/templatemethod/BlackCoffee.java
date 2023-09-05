package com.cike.templatemethod;

/**
 * @author kou
 * 具体模板类2
 */
public class BlackCoffee extends CoffeeTemplate{
    @Override
    protected void brewCoffeeGrinds() {
        System.out.println("用热水冲泡咖啡粉");
    }

    @Override
    protected void addCondiments() {
        // 不加任何调料
    }
}
