package com.cike.bridge;

/**
 * @author kou
 * 抽象部分
 */
public abstract class Abstraction {
    protected Implementor implementor;
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    abstract void operation();
}
