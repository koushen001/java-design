package com.cike.bridge;

/**
 * @author kou
 */
public class ConcreteAbstractionA extends Abstraction {
    public ConcreteAbstractionA(Implementor implementor) {
        super(implementor);
    }
    @Override
    void operation() {
        System.out.print("Concrete Abstraction A ");
        implementor.operationImpl();
    }
}
