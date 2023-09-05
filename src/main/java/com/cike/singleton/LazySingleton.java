package com.cike.singleton;

/**
 * @author kou
 * 懒汉式（Lazy Initialization）：在需要时才创建实例。
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {
        // 私有化构造函数
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
