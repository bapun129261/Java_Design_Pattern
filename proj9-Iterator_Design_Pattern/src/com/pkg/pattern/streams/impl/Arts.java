package com.pkg.pattern.streams.impl;

import com.pkg.pattern.iterator.Iiterator;
import com.pkg.pattern.iterator.impl.ArtsIterator;
import com.pkg.pattern.streams.Istreams;

import java.util.Arrays;

public class Arts<T> implements Istreams<T> {
    T[] subject;

    public Arts(T... subjects) {
        this.subject = Arrays.copyOf(subjects, subjects.length);
    }

    @Override
    public Iiterator<T> getIterator() {
        return new ArtsIterator<>(subject);
    }
}
