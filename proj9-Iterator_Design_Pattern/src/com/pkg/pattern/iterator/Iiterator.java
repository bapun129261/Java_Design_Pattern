package com.pkg.pattern.iterator;

public interface Iiterator<T> {
    boolean isDone();
    T next();
    T currentItem();
}
