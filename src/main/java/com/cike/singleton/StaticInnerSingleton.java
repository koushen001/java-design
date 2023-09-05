package com.cike.singleton;

/**
 * @author kou
 * 静态内部类（Static Inner Class）：利用类加载机制实现懒加载和线程安全。
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
        // 私有化构造函数
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
