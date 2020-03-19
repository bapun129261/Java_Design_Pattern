package com.pkg.pattern.builder.gardenBuilder.impl;

import com.pkg.pattern.build.optional.Garden;
import com.pkg.pattern.builder.gardenBuilder.GardenBuilder;

public class FlowerGardenBuilder implements GardenBuilder {
    private Garden garden;

    public FlowerGardenBuilder() {
        initGarden();
    }

    @Override
    public void putGardenItems() {
        System.out.println(" Adding all your requirement element ");
        garden.setArea(5000);
        garden.setName("Durga Garden");
        garden.setType("Flower");
    }

    @Override
    public void initGarden() {
        garden = new Garden();
    }

    @Override
    public Garden buildGarden() {
        System.out.println("Now were creating Flower Garden for you");
        try{
            Thread.sleep(2000);
            putGardenItems();
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println("Your Garden is Ready.....!");
        return garden;
    }
}
