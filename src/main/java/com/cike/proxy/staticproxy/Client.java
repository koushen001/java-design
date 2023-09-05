package com.cike.proxy.staticproxy;

/**
 * @author kou
 * 代理模式（Proxy Pattern）是一种结构型设计模式，它允许通过创建一个代理对象来控制对另一个对象的访问。代理模式的目的是在不改变原始对象的情况下，提供额外的功能，如权限控制、延迟加载、缓存等。
 * 代理模式的核心思想是：代理对象和被代理对象实现相同的接口，客户端通过调用代理对象来间接访问被代理对象。代理对象可以在调用被代理对象之前或之后执行一些操作，从而增加额外的功能。
 * 代理模式包括以下角色：
 * 主题接口（Subject Interface）：定义被代理对象和代理对象的共同接口。
 * 真实主题（Real Subject）：实现主题接口的被代理对象，提供真实的业务功能。
 * 代理（Proxy）：实现主题接口的代理对象，包含一个对真实主题对象的引用，可以控制对真实主题的访问。
 * 静态代理：
 * 静态代理是在编译时创建的代理对象，需要手动创建代理类。代理类和被代理类实现相同的接口，代理类中包含对被代理对象的引用，通过调用代理类的方法来实现对被代理对象的访问控制和功能增强。
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);

        proxySubject.doSomething();
    }
}
