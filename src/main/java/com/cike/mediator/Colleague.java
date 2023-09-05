package com.cike.mediator;

/**
 * @author kou
 * Colleague（同事）接口
 */
public interface Colleague {
    void send(String message);
    void receive(String message);
}
