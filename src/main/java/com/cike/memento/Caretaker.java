package com.cike.memento;

/**
 * @author kou
 * 管理者（Caretaker）类
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
