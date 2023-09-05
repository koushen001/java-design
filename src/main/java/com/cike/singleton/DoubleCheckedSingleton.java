package com.cike.singleton;

/**
 * @author kou
 * 双重检查锁（Double-Checked Locking）：在需要时创建实例，通过两次检查来确保线程安全。
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
        // 私有化构造函数
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
