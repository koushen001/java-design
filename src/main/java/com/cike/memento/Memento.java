package com.cike.memento;

/**
 * @author kou
 * 备忘录（Memento）类
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
