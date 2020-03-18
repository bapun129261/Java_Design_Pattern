package com.pkg.pattern.iterator.impl;

import com.pkg.pattern.iterator.Iiterator;

public class ArtsIterator<T> implements Iiterator<T> {
    private T[] subjects;
    private int position, lastPosition;


    public ArtsIterator(T[] subjects) {
        this.subjects = subjects;
        position = 0;
        lastPosition = subjects.length - 1;
    }

    @Override
    public boolean isDone() {
        return position < subjects.length;
    }

    @Override
    public T next() {
        return subjects[position++];
    }

    @Override
    public T currentItem() {
        if (isDone()) {
            return subjects[position];
        } else
            return subjects[lastPosition];
    }
}
