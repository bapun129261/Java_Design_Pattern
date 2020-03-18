package com.pkg.pattern.hotel.impl;

import com.pkg.pattern.hotel.Hotel;
import com.pkg.pattern.menu.Menu;
import com.pkg.pattern.menu.impl.Veg;

public class VegHotel implements Hotel {
    Veg veg;

    public VegHotel() {
        this.veg = new Veg();
    }

    @Override
    public Veg getMenu() {
        return veg;
    }

    @Override
    public void addMenu(String itemName, Double price) {
        veg.getItemsNameAndPrice().put(itemName, price);
    }
}
