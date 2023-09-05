package com.cike.strategy;

/**
 * @author kou
 * 具体策略类1
 */
public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("支付 " + amount + " 元，使用信用卡 " + cardNumber);
    }
}
