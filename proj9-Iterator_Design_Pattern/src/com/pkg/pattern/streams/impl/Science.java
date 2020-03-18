package com.pkg.pattern.streams.impl;

import com.pkg.pattern.iterator.Iiterator;
import com.pkg.pattern.iterator.impl.ScienceIterator;
import com.pkg.pattern.streams.Istreams;

import java.util.Arrays;
import java.util.List;

public class Science<T> implements Istreams<T> {

    List<T> subject;


    public Science(List<T> subjects) {
        this.subject = subjects;
    }

    @Override
    public Iiterator<T> getIterator() {
        return new ScienceIterator(subject);
    }
}
