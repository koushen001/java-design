package com.cike.chainresponsibility;

/**
 * @author kou
 * 具体处理器
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(int amount) {
        if (amount > 100 && amount <= 500) {
            System.out.println("ConcreteHandler2 handles request with amount: " + amount);
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}
