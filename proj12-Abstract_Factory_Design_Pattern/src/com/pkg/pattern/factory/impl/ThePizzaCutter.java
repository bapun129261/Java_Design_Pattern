package com.pkg.pattern.factory.impl;

import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.product.impl.CheesePizza;
import com.pkg.pattern.product.impl.ChickenPizza;
import com.pkg.pattern.product.impl.MushroomPizza;

public class ThePizzaCutter implements PizzaFactory {
    private static final String STORE_NAME="The Pizza Cutter";
    @Override
    public CheesePizza createCheesePizza() {
        CheesePizza cheesePizza=new CheesePizza();
        cheesePizza.setStoreName(STORE_NAME);
        cheesePizza.setPrice(233);
        return cheesePizza;
    }

    @Override
    public ChickenPizza createChickenPizza() {
        ChickenPizza chickenPizza=new ChickenPizza();
        chickenPizza.setStoreName(STORE_NAME);
        chickenPizza.setPrice(533);
        return chickenPizza;
    }

    @Override
    public MushroomPizza createMushroomPizza() {
        MushroomPizza mushroomPizza=new MushroomPizza();
        mushroomPizza.setStoreName(STORE_NAME);
        mushroomPizza.setPrice(380);
        return mushroomPizza;
    }
}
