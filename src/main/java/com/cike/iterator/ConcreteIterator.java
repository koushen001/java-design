package com.cike.iterator;

import java.util.NoSuchElementException;

/**
 * @author kou
 * ConcreteIterator（具体迭代器）类
 */
public class ConcreteIterator<T> implements Iterator<T>{
    private T[] elements;
    private int position = 0;
    public ConcreteIterator(T[] elements) {
        this.elements = elements;
    }
    @Override
    public boolean hasNext() {
        return position < elements.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[position++];
    }
}
