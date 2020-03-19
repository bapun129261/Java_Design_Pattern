package com.pkg.pattern.caretacker.impl;

import com.pkg.pattern.caretacker.Icaretaker;
import com.pkg.pattern.memento.impl.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker implements Icaretaker {
    private List<Memento> history;
    private int currentState = -1;

    public Caretaker() {
        this.history = new ArrayList<>();
    }

    @Override
    public void addMemento(Memento memento) {
        history.add(memento);
        currentState = history.size() - 1;
    }

    @Override
    public Memento previousArticle() {
        System.out.println("Going to Previous Article...!");
        if (currentState <= 0) {
            Memento memento = history.get(currentState);
            currentState = 0;
            return memento;
        }
        Memento memento = history.get(currentState);
        currentState--;
        return memento;
    }

    @Override
    public Memento currentArticle() {
        System.out.println("Going to Current Article...!");

        if (currentState >= this.history.size()-1) {

            Memento memento = history.get(currentState);
            currentState = this.history.size() - 1;
            return memento;
        }
        Memento memento = history.get(currentState);
        currentState++;
        return memento;
    }

    @Override
    public Memento getMemento(int index) {
        return history.get(index);
    }
}
