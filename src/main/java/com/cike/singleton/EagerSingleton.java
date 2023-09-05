package com.cike.singleton;

/**
 * @author kou
 * 饿汉式（Eager Initialization）：在类加载时就创建实例。
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        // 私有化构造函数
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
}
