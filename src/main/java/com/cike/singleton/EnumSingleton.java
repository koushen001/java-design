package com.cike.singleton;

/**
 * @author kou
 * 枚举单例：利用枚举的特性实现单例。
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("枚举单例的方法");
    }
}
