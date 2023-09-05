package com.cike.abstractfactory;

/**
 * @author kou
 * 具体产品B
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Blue color filled");
    }
}
