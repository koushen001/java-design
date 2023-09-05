package com.cike.abstractfactory;

/**
 * @author kou
 * 具体产品A
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}
