package com.cike.strategy;

/**
 * @author kou
 * 具体策略类2
 */
public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("支付 " + amount + " 元，使用PayPal账户 " + email);
    }
}
