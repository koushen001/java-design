package com.cike.chainresponsibility;

/**
 * @author kou
 * 具体处理器
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(int amount) {
        if (amount <= 100) {
            System.out.println("ConcreteHandler1 handles request with amount: " + amount);
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}
