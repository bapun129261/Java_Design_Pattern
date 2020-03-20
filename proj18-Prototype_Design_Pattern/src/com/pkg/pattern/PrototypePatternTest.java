package com.pkg.pattern;


import com.pkg.pattern.prototype.Prototype;
import com.pkg.pattern.prototype.impl.ConcretePrototype;
import com.pkg.pattern.prototype.register.PrototypeRegistry;

public class PrototypePatternTest {
    public static void main(String[] args) {
        ConcretePrototype original=new ConcretePrototype("Test");
        PrototypeRegistry.registerPrototype("Original",original);
        ConcretePrototype clone= (ConcretePrototype) PrototypeRegistry.getClonePrototypeFromRegistry("Original");
        System.out.println(original);
        System.out.println(clone);
        System.out.println();
        System.out.println(original.getName());
        System.out.println(clone.getName());


    }
}
