package com.cike.proxy.staticproxy;

/**
 * @author kou
 * 代理
 */
public class ProxySubject implements Subject {
    private final RealSubject realSubject;
    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public void doSomething() {
        System.out.println("ProxySubject is doing something before RealSubject.");
        realSubject.doSomething();
        System.out.println("ProxySubject is doing something after RealSubject.");
    }
}
