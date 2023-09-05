package com.cike.state;

/**
 * @author kou
 * 状态模式（State Pattern）是一种行为型设计模式，用于将一个对象的状态和状态相关的行为进行封装，使对象在不同状态下可以改变其行为，同时降低了对象的复杂性。状态模式将一个对象的状态抽象为一个独立的类，允许对象在运行时切换不同的状态，从而改变其行为。
 * 状态模式的关键角色包括：
 * 上下文（Context）：上下文是拥有状态的对象，它维护一个对抽象状态的引用，并在需要时切换到不同的状态。
 * 抽象状态（State）：抽象状态是一个接口或抽象类，定义了具体状态类需要实现的方法。
 * 具体状态（Concrete State）：具体状态是实现抽象状态接口的具体类，每个具体状态类代表了对象在不同状态下的行为。
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // 初始状态为状态1
        State state1 = new ConcreteState1();
        context.setState(state1);
        context.performAction();

        // 切换到状态2
        State state2 = new ConcreteState2();
        context.setState(state2);
        context.performAction();
    }
}
