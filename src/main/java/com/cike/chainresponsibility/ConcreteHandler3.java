package com.cike.chainresponsibility;

/**
 * @author kou
 * 具体处理器
 */
public class ConcreteHandler3 extends Handler{
    @Override
    public void handleRequest(int amount) {
        if (amount > 500) {
            System.out.println("ConcreteHandler3 handles request with amount: " + amount);
        } else if (successor != null) {
            successor.handleRequest(amount);
        }
    }
}
