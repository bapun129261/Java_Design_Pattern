package com.pkg.pattern;

import com.pkg.pattern.facade.Waiter;
import com.pkg.pattern.facade.impl.HotelWaiter;

public class FacadePatternTest {
    public static void main(String[] args) {
        Waiter waiter=new HotelWaiter();
        System.out.println();
        System.out.println(" Veg Menu Card");
        System.out.println();
        waiter.getVegMenu();
        System.out.println();
        System.out.println(" Non-Veg Menu Card");
        System.out.println();
        waiter.getNonVegMenu();
        System.out.println();
        System.out.println("Veg And Non-Veg Menu Card");
        System.out.println();
        waiter.getVegAndNonVegMenu();

    }
}
