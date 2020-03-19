package com.pkg.pattern.factory.impl;

import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.product.Pizza;
import com.pkg.pattern.product.impl.CheesePizza;
import com.pkg.pattern.product.impl.ChickenPizza;
import com.pkg.pattern.product.impl.MushroomPizza;

public class DominosPizzaFactory implements PizzaFactory {
    @Override
    public Pizza getPizza(Enum type) {
        switch (type.toString()) {
            case "Cheese":
                return new CheesePizza();
            case "Chicken":
                return new ChickenPizza();
            case "Mushroom":
                return new MushroomPizza();
            default:
                throw new RuntimeException(type + " Pizza is not available..!");
        }
    }
}
