package com.cike.factorymethod;

/**
 * @author kou
 * 具体工厂
 */
public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
