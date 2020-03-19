package com.pkg.pattern.factory;


import com.pkg.pattern.product.impl.CheesePizza;
import com.pkg.pattern.product.impl.ChickenPizza;
import com.pkg.pattern.product.impl.MushroomPizza;

public interface PizzaFactory {
    CheesePizza createCheesePizza();

    ChickenPizza createChickenPizza();

    MushroomPizza createMushroomPizza();
}
