package com.pkg.pattern.prototype.register;

import com.pkg.pattern.prototype.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<String, Prototype> prototypeRegistry;

    static {
     prototypeRegistry = new HashMap<>();
    }

    public static void registerPrototype(String name, Prototype prototype) {
        prototypeRegistry.put(name, prototype);
    }

    public static Prototype getClonePrototypeFromRegistry(String name) {
        return prototypeRegistry.get(name).clonePrototype();
    }

}
