package com.cike.facade;

/**
 * @author kou
 * 外观类
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }


    public void start() {
        System.out.println("Starting computer...");
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.execute();
        System.out.println("Computer started.");
    }
}
