package com.cike.builder;

/**
 * @author kou
 */
public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        builder.buildCPU();
        builder.buildMemory();
        builder.buildStorage();
        return builder.getResult();
    }
}
