package com.cike.abstractfactory;

/**
 * @author kou
 * 具体产品B
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red color filled");
    }
}
