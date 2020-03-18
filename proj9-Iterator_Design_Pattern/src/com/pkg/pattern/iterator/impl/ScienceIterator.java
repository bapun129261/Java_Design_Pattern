package com.pkg.pattern.iterator.impl;

import com.pkg.pattern.iterator.Iiterator;

import java.util.List;

public class ScienceIterator<T> implements Iiterator<T> {
    private List<T> subjects;

    public ScienceIterator(List<T> subjects) {
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
