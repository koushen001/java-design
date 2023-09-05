package com.cike.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kou
 * 享元工厂
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();
    public Flyweight getFlyweight(String key) {
        if (flyweightMap.containsKey(key)) {
            return flyweightMap.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key, flyweight);
            return flyweight;
        }
    }
}
