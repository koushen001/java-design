package com.cike.mediator;

/**
 * @author kou
 * ConcreteColleague1（具体同事1）类
 */
public class ConcreteColleague1 implements Colleague{
    private Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1 received: " + message);
    }
}
