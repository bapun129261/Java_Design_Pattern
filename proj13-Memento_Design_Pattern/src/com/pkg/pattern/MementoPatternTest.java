package com.pkg.pattern;


import com.pkg.pattern.caretacker.impl.Caretaker;
import com.pkg.pattern.originator.impl.Originator;

public class MementoPatternTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        for (int i = 1; i <= 10; i++) {
            originator.setArticle("Article" + i);
            caretaker.addMemento(originator.saveMemento());
        }
        printArticle(originator);
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        printArticle(originator);

        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        originator.restoreMemento(caretaker.currentArticle());
        printArticle(originator);
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        originator.restoreMemento(caretaker.previousArticle());
        printArticle(originator);
    }

    private static final void printArticle(Originator originator) {
        System.out.println("Current Article :" + originator.getArticle());
    }
}
