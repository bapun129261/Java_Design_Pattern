package com.pkg.pattern.originator.impl;

import com.pkg.pattern.memento.Imemento;
import com.pkg.pattern.memento.impl.Memento;
import com.pkg.pattern.originator.Ioriginator;

public class Originator implements Ioriginator {
    private String article;

    @Override
    public Memento saveMemento() {
        return new Memento(this.article);
    }

    public String getArticle() {
        return this.article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void restoreMemento(Memento memento) {
        this.article = memento.getArticle();
    }
}
