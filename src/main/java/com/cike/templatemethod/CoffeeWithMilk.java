package com.cike.templatemethod;

/**
 * @author kou
 * 具体模板类1
 */
public class CoffeeWithMilk extends CoffeeTemplate{
    @Override
    protected void brewCoffeeGrinds() {
        System.out.println("用热水冲泡咖啡粉");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶");
    }
}
