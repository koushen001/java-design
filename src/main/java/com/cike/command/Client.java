package com.cike.command;

/**
 * @author kou
 * 命令模式（Command Pattern）是一种行为型设计模式，它将请求或操作封装为一个对象，从而允许你参数化客户端对象（发送请求的对象），将请求排队或记录请求，以及支持可撤销的操作。
 * 命令模式的主要目的是将请求发送者（Invoker）和请求接收者（Receiver）解耦，它通过引入一个中间对象（Command）来实现这一目标。命令对象包含了对请求接收者的引用以及执行请求的方法。
 * 以下是命令模式的关键角色：
 * Command（命令）：定义了执行操作的接口，通常包括一个execute方法。
 * ConcreteCommand（具体命令）：实现了Command接口，负责将请求转化为特定的操作。
 * Receiver（接收者）：知道如何执行真正的操作。实际执行请求的对象。
 * Invoker（请求者）：负责调用命令对象来执行请求，它不知道命令是如何执行的，只需要调用命令对象的execute方法。
 * Client（客户端）：创建命令对象并将其与接收者关联，然后将命令对象传递给请求者。
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);

        remote.pressButton();
    }
}
