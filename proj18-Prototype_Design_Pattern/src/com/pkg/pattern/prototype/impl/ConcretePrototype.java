package com.pkg.pattern.prototype.impl;

import com.pkg.pattern.prototype.Prototype;

public class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        this.name=prototype.getName();
    }

    @Override
    public Prototype clonePrototype() {
        return new ConcretePrototype(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype :"+String.valueOf(this.hashCode());
    }
}
