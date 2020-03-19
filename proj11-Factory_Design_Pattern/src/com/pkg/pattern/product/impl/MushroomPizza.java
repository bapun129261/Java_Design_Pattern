package com.pkg.pattern.product.impl;

import com.pkg.pattern.product.Pizza;

public class MushroomPizza implements Pizza {
    @Override
    public String getNameOfThePizza() {
        return "Mushroom Pizza";
    }

    @Override
    public double getPrice() {
        return 540D;
    }
}
