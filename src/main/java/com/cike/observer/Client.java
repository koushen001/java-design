package com.cike.observer;

/**
 * @author kou
 * 观察者模式（Observer Pattern）是一种常用的设计模式，用于在对象之间建立一种一对多的依赖关系，当一个对象的状态发生变化时，所有依赖它的对象都会得到通知并自动更新。这种模式被广泛用于实现事件处理系统、GUI编程、发布-订阅系统等场景。
 * 观察者模式涉及以下几个关键角色：
 * 主题（Subject）：也称为被观察者，它维护一组观察者对象，提供注册和删除观察者的方法，并在状态改变时通知观察者。
 * 观察者（Observer）：观察者是依赖主题的对象，当主题状态发生改变时，观察者会接收到通知并执行相应的操作。
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("观察者1");
        Observer observer2 = new ConcreteObserver("观察者2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        // 触发通知
        subject.setState("新消息来了！");

        subject.removeObserver(observer1);
        // 只通知observer2
        subject.setState("另一条消息！");
    }
}
