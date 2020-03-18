package com.pkg.pattern.facade.impl;

import com.pkg.pattern.facade.Waiter;
import com.pkg.pattern.hotel.Hotel;
import com.pkg.pattern.hotel.impl.NonVegAndVegHotel;
import com.pkg.pattern.hotel.impl.NonVegHotel;
import com.pkg.pattern.hotel.impl.VegHotel;
import com.pkg.pattern.menu.Menu;

import java.util.Iterator;

public class HotelWaiter implements Waiter {
    @Override
    public void getVegMenu() {
        Menu menu = new VegHotel().getMenu();
        System.out.println(String.format("%1$8s %2$12s %3$17s ", "ITEMS", "TYPE", "PRICE"));
        System.out.println("--------------------------------------------");
        Iterator<String> nameIterator = menu.menuName().iterator();
        Iterator<Double> priceIterator = menu.menuPrice().iterator();

        while (nameIterator.hasNext() && priceIterator.hasNext()) {
            System.out.println(String.format("%1$10s %2$10s %3$18s", nameIterator.next(), " VEG ", priceIterator.next()));
        }

    }

    @Override
    public void getNonVegMenu() {
        Menu menu = new NonVegHotel().getMenu();
        System.out.println(String.format("%1$10s %2$20s %3$13s ", "ITEMS", "TYPE", "PRICE"));
        System.out.println("------------------------------------------------");
        Iterator<String> nameIterator = menu.menuName().iterator();
        Iterator<Double> priceIterator = menu.menuPrice().iterator();

        while (nameIterator.hasNext() && priceIterator.hasNext()) {
            System.out.println(String.format("%1$17s %2$15s %3$10s", nameIterator.next(), " NON-NEG ", priceIterator.next()));
        }


    }

    @Override
    public void getVegAndNonVegMenu() {
        Menu vegAndNonVegMenu = new NonVegAndVegHotel().getMenu();
        System.out.println(String.format("%1$12s %2$15s %3$13s ", "ITEMS", "TYPE", "PRICE"));
        System.out.println("--------------------------------------------");
        Iterator<String> nameIterator = vegAndNonVegMenu.menuName().iterator();
        Iterator<Double> priceIterator = vegAndNonVegMenu.menuPrice().iterator();

        while (nameIterator.hasNext() && priceIterator.hasNext()) {
            System.out.println(String.format("%1$18s %2$10s %3$8s", nameIterator.next(), " VEG/NON-VEG ", priceIterator.next()));
        }
    }
}
