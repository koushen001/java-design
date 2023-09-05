package com.cike.iterator;

/**
 * @author kou
 * Aggregate（集合）接口
 */
public interface Aggregate <T>{
    Iterator<T> createIterator();
}
