package com.cike.state;

/**
 * @author kou
 * 具体状态类2
 */
public class ConcreteState2 implements State{
    @Override
    public void handle() {
        System.out.println("执行状态2的行为");
    }
}
