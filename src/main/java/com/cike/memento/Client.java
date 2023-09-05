package com.cike.memento;

/**
 * @author kou
 * 备忘录模式（Memento Pattern）是一种行为型设计模式，它用于捕获一个对象的内部状态，并且在不暴露对象内部结构的情况下保存和恢复其状态。备忘录模式通常涉及三个角色：发起人（Originator）、备忘录（Memento）、和管理者（Caretaker）。
 * 发起人（Originator）：发起人是要被保存状态的对象。它创建备忘录以保存自己的状态，并可以使用备忘录来恢复状态。
 * 备忘录（Memento）：备忘录是用于存储发起人对象的内部状态的对象。它包含了需要保存的状态信息。
 * 管理者（Caretaker）：管理者负责保存和恢复备忘录对象。它通常不了解备忘录的具体内容，只负责保持备忘录对象。
 * 备忘录模式的核心思想是将状态保存到备忘录对象中，然后将备忘录对象存储起来，当需要恢复状态时，从备忘录中获取状态并还原到发起人对象中。
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置发起人的状态
        originator.setState("State 1");

        // 保存状态到备忘录
        caretaker.setMemento(originator.saveStateToMemento());

        // 修改发起人的状态
        originator.setState("State 2");

        // 从备忘录中恢复状态
        originator.getStateFromMemento(caretaker.getMemento());

        System.out.println("Current State: " + originator.getState());
    }
}
