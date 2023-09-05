package com.cike.chainresponsibility;

/**
 * @author kou
 * 处理器接口
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int amount);
}
