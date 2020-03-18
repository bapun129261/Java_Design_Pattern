package com.pkg.pattern.streams;

import com.pkg.pattern.iterator.Iiterator;

public interface Istreams<T> {
    Iiterator<T> getIterator();
}
