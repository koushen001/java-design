package com.cike.mediator;

/**
 * @author kou
 * Mediator（中介者）接口
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}
