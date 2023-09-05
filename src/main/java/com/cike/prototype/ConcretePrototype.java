package com.cike.prototype;

import lombok.Data;

/**
 * @author kou
 * 具体原型
 */
@Data
public class ConcretePrototype implements Prototype{

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(name);
    }
}
