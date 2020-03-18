package com.pkg.pattern.iterator.impl;

import com.pkg.pattern.iterator.Iiterator;

import java.util.List;

public class ScienceIterator<T> implements Iiterator<T> {
    private List<T> subjects;
    private int position, lastPosition;

    public ScienceIterator(List<T> subjects) {
        this.subjects = subjects;
        position = 0;
        lastPosition = subjects.size() - 1;
    }

    @Override
    public boolean isDone() {
        return position < subjects.size();
    }

    @Override
    public T next() {
        return subjects.get(position++);
    }

    @Override
    public T currentItem() {
        if (isDone()) {
            return subjects.get(position);
        } else
            return subjects.get(lastPosition);
    }
}
