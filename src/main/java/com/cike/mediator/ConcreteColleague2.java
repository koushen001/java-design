package com.cike.mediator;

/**
 * @author kou
 * ConcreteColleague2（具体同事2）类
 */
public class ConcreteColleague2 implements Colleague{
    private Mediator mediator;

    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague2 received: " + message);
    }
}
