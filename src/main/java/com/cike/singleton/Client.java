package com.cike.singleton;

/**
 * @author kou
 */
public class Client {
    public static void main(String[] args) {
        // 获取单例实例
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        // 判断是否是同一个实例
        if (singleton1 == singleton2) {
            System.out.println("两个实例是同一个实例");
        } else {
            System.out.println("两个实例不是同一个实例");
        }
    }
}
