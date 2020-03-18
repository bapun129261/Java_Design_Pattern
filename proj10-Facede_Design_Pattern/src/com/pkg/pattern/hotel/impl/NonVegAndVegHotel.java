package com.pkg.pattern.hotel.impl;

import com.pkg.pattern.hotel.Hotel;
import com.pkg.pattern.menu.Menu;
import com.pkg.pattern.menu.impl.NonVeg;
import com.pkg.pattern.menu.impl.VegAndNonVeg;

public class NonVegAndVegHotel implements Hotel {
    private VegAndNonVeg vegAndNonVeg;

    public NonVegAndVegHotel() {
        this.vegAndNonVeg = new VegAndNonVeg();
    }

    @Override
    public void addMenu(String itemName, Double price) {
        vegAndNonVeg.getItemsNameAndPrice().put(itemName, price);
    }

    @Override
    public VegAndNonVeg getMenu() {
        return vegAndNonVeg;
    }
}
