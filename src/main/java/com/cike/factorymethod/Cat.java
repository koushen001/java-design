package com.cike.factorymethod;

/**
 * @author kou
 * 具体产品
 */
public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow Meow");
    }
}
