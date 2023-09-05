package com.cike.state;

/**
 * @author kou
 * 上下文类
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void performAction() {
        state.handle();
    }
}
