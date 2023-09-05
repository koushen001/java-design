package com.cike.adapter;

/**
 * @author kou
 * 适配器模式（Adapter Pattern）是一种结构型设计模式，它允许将一个类的接口转换成客户端所期望的另一个接口。适配器模式使得原本不兼容的类可以一起工作，从而实现了类之间的协同工作。
 * 适配器模式通过创建一个中间适配器类，将不兼容的接口转换为目标接口。这个中间适配器类既实现了目标接口，又包含一个原始类的实例，通过调用原始类的方法来实现适配。
 * 适配器模式包括以下角色：
 * 目标接口（Target Interface）：定义客户端期望的接口，适配器将原始接口转换为这个接口。
 * 适配者类（Adaptee Class）：具有不兼容接口的类。
 * 适配器类（Adapter Class）：实现目标接口，并包含一个适配者类的实例，通过调用适配者类的方法来实现目标接口。
 */
public class Client {
    public static void main(String[] args) {
        // 使用适配者类创建适配器对象
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        // 调用目标接口的方法，实际上调用了适配者类的方法
        adapter.request();
    }
}
