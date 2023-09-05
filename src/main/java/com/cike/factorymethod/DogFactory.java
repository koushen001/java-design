package com.cike.factorymethod;

/**
 * @author kou
 * 具体工厂
 */
public class DogFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
