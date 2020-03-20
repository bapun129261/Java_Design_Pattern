package com.pkg.pattern.component;

import com.pkg.pattern.mediator.Mediator;

public abstract class Person {
    protected Mediator mediator;
    private Enum name;

    public Person(Mediator mediator, Enum name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    public Enum getNAME() {
        return name;
    }
}
