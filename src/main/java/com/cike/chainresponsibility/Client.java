package com.cike.chainresponsibility;

/**
 * @author kou
 * 责任链模式（Chain of Responsibility Pattern）是一种行为型设计模式，它允许多个对象在一个链式结构中处理请求，从而避免将发送者和接收者之间的耦合。请求会在链上依次经过每个处理器，直到找到能够处理请求的处理器为止。
 * 责任链模式的核心思想是：将能够处理请求的对象组成一条链，并将请求从链的一端传递到另一端，直到有一个对象能够处理请求为止。
 * 责任链模式包括以下角色：
 * 处理器（Handler）：定义处理请求的接口，具体的处理器实现这个接口，可以将请求传递给下一个处理器。
 * 具体处理器（Concrete Handler）：实现处理器接口，具体处理请求的对象。如果自己不能处理请求，则将请求传递给下一个处理器。
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handleRequest(50);
        handler1.handleRequest(200);
        handler1.handleRequest(800);
    }
}
