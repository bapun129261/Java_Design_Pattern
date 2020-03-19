package com.pkg.pattern.product.impl;

import com.pkg.pattern.product.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public String getNameOfThePizza() {
        return "Cheese Pizza";
    }

    @Override
    public double getPrice() {
        return 320D;
    }
}
