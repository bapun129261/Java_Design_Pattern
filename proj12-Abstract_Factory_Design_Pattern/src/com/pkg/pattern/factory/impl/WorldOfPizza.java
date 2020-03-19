package com.pkg.pattern.factory.impl;

import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.product.impl.CheesePizza;
import com.pkg.pattern.product.impl.ChickenPizza;
import com.pkg.pattern.product.impl.MushroomPizza;

public class WorldOfPizza implements PizzaFactory {
    private static final String STORE_NAME="World Of Pizza";
    @Override
    public CheesePizza createCheesePizza() {
        CheesePizza cheesePizza=new CheesePizza();
        cheesePizza.setStoreName(STORE_NAME);
        cheesePizza.setPrice(275);
        return cheesePizza;
    }

    @Override
    public ChickenPizza createChickenPizza() {
        ChickenPizza chickenPizza=new ChickenPizza();
        chickenPizza.setStoreName(STORE_NAME);
        chickenPizza.setPrice(630);
        return chickenPizza;
    }

    @Override
    public MushroomPizza createMushroomPizza() {
        MushroomPizza mushroomPizza=new MushroomPizza();
        mushroomPizza.setStoreName(STORE_NAME);
        mushroomPizza.setPrice(323);
        return mushroomPizza;
    }
}
