package com.cike.facade;

/**
 * @author kou
 * 外观模式（Facade Pattern）是一种结构型设计模式，它提供了一个统一的接口，用于访问子系统中的一组接口。外观模式通过创建一个高层接口，隐藏了子系统的复杂性，使得客户端更容易使用子系统。
 * 外观模式的核心思想是：将一组复杂的子系统接口封装在一个高层接口中，为客户端提供一个简化的接口。客户端通过调用外观接口来完成一系列操作，而不需要了解子系统的内部细节。
 * 外观模式包括以下角色：
 * 外观（Facade）：提供一个高层接口，用于隐藏子系统的复杂性。
 * 子系统（Subsystem）：包含一组相关的类，每个类都实现了一部分子系统的功能。
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
