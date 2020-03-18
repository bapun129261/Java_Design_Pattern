package com.pkg.pattern.hotel;


import com.pkg.pattern.menu.Menu;

public interface Hotel {
    Menu getMenu();
    void addMenu(String itemName, Double price);
}
