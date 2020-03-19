package com.pkg.pattern.factory.impl.abstracts;

import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.factory.impl.*;

public abstract class AbstractPizzaFactory implements PizzaFactory {

    public static PizzaFactory getPizzaStore(Enum type) {
        switch (type.toString()) {
            case "Domino's":
                return new DominosPizza();
            case "Pizza Express":
                return new PizzaExpress();
            case "Pizza Hot":
                return new PizzaHot();
            case "The Pizza Cutter":
                return new ThePizzaCutter();
            case "World Of Pizza":
                return new WorldOfPizza();


            default:
                throw new RuntimeException("Invalid pizza store");
        }
    }
}
