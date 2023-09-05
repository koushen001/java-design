package com.cike.bridge;

/**
 * @author kou
 * 具体抽象部分B
 */
public class ConcreteAbstractionB extends Abstraction{
    public ConcreteAbstractionB(Implementor implementor) {
        super(implementor);
    }
    @Override
    void operation() {
        System.out.print("Concrete Abstraction B ");
        implementor.operationImpl();
    }
}
