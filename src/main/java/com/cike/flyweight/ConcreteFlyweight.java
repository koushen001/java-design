package com.cike.flyweight;

/**
 * @author kou
 * 具体享元
 */
public class ConcreteFlyweight implements Flyweight{
    private String internalState;
    public ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }
    @Override
    public void operation(String externalState) {
        System.out.println("Internal state: " + internalState + ", External state: " + externalState);
    }
}
