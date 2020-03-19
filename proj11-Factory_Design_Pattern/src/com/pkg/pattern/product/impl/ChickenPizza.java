package com.pkg.pattern.product.impl;

import com.pkg.pattern.product.Pizza;

public class ChickenPizza implements Pizza {
    @Override
    public String getNameOfThePizza() {
        return "Chicken pizza";
    }

    @Override
    public double getPrice() {
        return 490D;
    }
}
