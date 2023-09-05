package com.cike.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author kou
 * InvocationHandler实现
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object realSubject;

    public MyInvocationHandler(Object realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ProxySubject is doing something before RealSubject.");
        Object result = method.invoke(realSubject, args);
        System.out.println("ProxySubject is doing something after RealSubject.");
        return result;
    }
}
