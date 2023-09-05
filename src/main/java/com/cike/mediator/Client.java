package com.cike.mediator;

/**
 * @author kou
 * 中介者模式（Mediator Pattern）是一种行为型设计模式，它用于降低多个对象之间的直接通信，将对象之间的交互通过一个中介者对象来进行，从而减少对象之间的耦合度。中介者模式将复杂的交互关系变得更加简单和可维护。
 * 中介者模式通常涉及以下角色：
 * Mediator（中介者）：定义了一个接口，用于处理对象之间的通信。中介者知道各个对象，并协调它们的交互。中介者模式通常只有一个中介者。
 * ConcreteMediator（具体中介者）：实现了中介者接口，负责协调具体的对象之间的通信。它通常包括对各个对象的引用，并定义了它们之间的交互规则。
 * Colleague（同事）：定义了一个接口，通常包含一个用于向中介者发送消息的方法。同事对象之间不直接通信，而是通过中介者来交互。
 * ConcreteColleague（具体同事）：实现了同事接口，负责实际的业务逻辑。它包括向中介者发送消息的方法，以及接收从中介者发送的消息的方法。
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello from Colleague1");
        colleague2.send("Hi from Colleague2");
    }
}
