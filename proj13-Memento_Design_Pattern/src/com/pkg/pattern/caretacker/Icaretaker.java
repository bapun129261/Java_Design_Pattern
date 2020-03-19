package com.pkg.pattern.caretacker;

import com.pkg.pattern.memento.impl.Memento;

public interface Icaretaker {
    void addMemento(Memento memento);
    Memento previousArticle();
    Memento currentArticle();
    Memento getMemento(int index);


}
