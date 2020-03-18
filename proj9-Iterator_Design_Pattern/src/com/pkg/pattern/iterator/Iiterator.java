package com.pkg.pattern.iterator;

public interface Iiterator<T> {
    Boolean isDone();
    T next();
    T currentItem();
}
