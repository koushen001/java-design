package com.cike.builder;

/**
 * @author kou
 */
public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
