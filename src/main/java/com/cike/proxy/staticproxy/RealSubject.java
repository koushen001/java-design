package com.cike.proxy.staticproxy;

/**
 * @author kou
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("RealSubject is doing something.");
    }
}
