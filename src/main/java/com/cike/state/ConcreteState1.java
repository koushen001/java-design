package com.cike.state;

/**
 * @author kou
 * 具体状态类1
 */
public class ConcreteState1 implements State{
    @Override
    public void handle() {
        System.out.println("执行状态1的行为");
    }
}
