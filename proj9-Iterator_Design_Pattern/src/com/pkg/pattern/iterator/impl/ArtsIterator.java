package com.pkg.pattern.iterator.impl;

import com.pkg.pattern.iterator.Iiterator;

public class ArtsIterator<T> implements Iiterator<T> {
    private T[] subjects;

    public ArtsIterator(T[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public Boolean isDone() {
        return null;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public T currentItem() {
        return null;
    }
}
