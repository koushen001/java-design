package com.cike.strategy;

/**
 * @author kou
 * 策略模式（Strategy Pattern）是一种行为型设计模式，它允许你定义一系列算法（策略），将每个算法封装成一个独立的类，并使它们可以互相替换，使客户端代码能够在运行时选择不同的策略来完成特定的任务，而不必修改其源代码。策略模式提供了一种方式来解决对象行为的变化问题，同时保持了对象的封装性。
 * 策略模式的关键角色包括：
 * 上下文（Context）：上下文是拥有策略对象的类，它根据需要在运行时切换不同的策略。
 * 策略接口（Strategy）：策略接口定义了具体策略类必须实现的方法，通常是一个通用的接口或抽象类。
 * 具体策略类（Concrete Strategy）：具体策略类实现了策略接口，每个具体策略类代表了一个不同的算法或策略。
 */
public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // 使用信用卡支付
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // 使用PayPal支付
        PaymentStrategy payPalPayment = new PayPalPayment("example@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}
