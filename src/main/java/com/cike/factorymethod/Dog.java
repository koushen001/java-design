package com.cike.factorymethod;

/**
 * @author kou
 * 具体产品
 */
public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof Woof");
    }
}
