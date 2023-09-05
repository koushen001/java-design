package com.cike.mediator;

/**
 * @author kou
 * ConcreteMediator（具体中介者）类
 */
public class ConcreteMediator implements Mediator {
    private Colleague colleague1;
    private Colleague colleague2;
    public void setColleague1(Colleague colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(Colleague colleague) {
        this.colleague2 = colleague;
    }
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.receive(message);
        } else if (colleague == colleague2) {
            colleague1.receive(message);
        }
    }
}
