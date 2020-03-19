package com.pkg.pattern.memento.impl;

import com.pkg.pattern.memento.Imemento;

public class Memento implements Imemento {
    private String article;

    public Memento(String article) {
        this.article = article;
    }

    @Override
    public String getArticle() {
        return article;
    }
}
