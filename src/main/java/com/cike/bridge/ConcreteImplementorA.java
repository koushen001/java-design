package com.cike.bridge;

/**
 * @author kou
 * 具体实现部分A
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor A operation");
    }
}
