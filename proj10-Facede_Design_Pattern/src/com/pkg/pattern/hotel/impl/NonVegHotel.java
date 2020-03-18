package com.pkg.pattern.hotel.impl;

import com.pkg.pattern.hotel.Hotel;
import com.pkg.pattern.menu.Menu;
import com.pkg.pattern.menu.impl.NonVeg;

public class NonVegHotel implements Hotel {
    private NonVeg nonVeg;

    public NonVegHotel() {
        this.nonVeg = new NonVeg();
    }

    @Override
    public void addMenu(String itemName, Double price) {
        nonVeg.getItemsNameAndPrice().put(itemName, price);
    }

    @Override
    public NonVeg getMenu() {
        return new NonVeg();
    }
}
