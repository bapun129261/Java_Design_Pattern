package com.pkg.pattern.subject.impl;

import com.pkg.pattern.subject.MainAbstractSubject;

public class ConcreteSubject extends MainAbstractSubject {
    public ConcreteSubject() {
        System.out.println(" ConcreteSubject object Created");
    }

    @Override
    public void doSomework() {
        System.out.println("Im from ConcreteSubject");
    }
}
