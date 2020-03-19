package com.pkg.pattern.product.impl;

import com.pkg.pattern.product.Pizza;

public class MushroomPizza implements Pizza {

    private String storeName;
    private double price;

    @Override
    public String getNameOfThePizza() {
        return storeName + " Mushroom Pizza";
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
