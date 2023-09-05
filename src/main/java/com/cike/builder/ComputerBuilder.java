package com.cike.builder;

/**
 * @author kou
 * 抽象建造者：定义构建产品的抽象方法
 */
public interface ComputerBuilder {
    void buildCPU();
    void buildMemory();
    void buildStorage();
    Computer getResult();
}
