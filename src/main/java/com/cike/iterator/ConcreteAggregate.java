package com.cike.iterator;

/**
 * @author kou
 * ConcreteAggregate（具体集合）类
 */
public class ConcreteAggregate<T> implements Aggregate<T>{
    private T[] elements;

    public ConcreteAggregate(T[] elements) {
        this.elements = elements;
    }
    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(elements);
    }
}
