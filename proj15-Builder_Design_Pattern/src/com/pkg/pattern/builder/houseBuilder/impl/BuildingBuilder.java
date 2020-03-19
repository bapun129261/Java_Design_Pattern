package com.pkg.pattern.builder.houseBuilder.impl;

import com.pkg.pattern.build.House;

import com.pkg.pattern.builder.gardenBuilder.impl.FlowerGardenBuilder;
import com.pkg.pattern.builder.houseBuilder.HouseBuilder;
import com.pkg.pattern.builder.poolBuilder.impl.SwimmingPoolBuilder;

public class BuildingBuilder implements HouseBuilder {
    House house;

    public BuildingBuilder() {
        initHouse();
    }

    @Override
    public void initHouse() {
        this.house = new House();
    }

    @Override
    public void buildWall() {
        System.out.println("building wall");
        house.setFloor(2);
        house.setHeight(1100);
        house.setWidth(2500);
        house.setWallType("Marble");
    }

    @Override
    public void paintWall() {
        System.out.println("Panting wall");
        house.setWallColor("Blue");
    }

    @Override
    public void putStare() {
        System.out.println("putting stare");
        house.setRequiredStare(true);
    }

    @Override
    public void addSwimmingPool() {
        System.out.println("Adding new Swimming pool");
        house.setSwimmingPool(new SwimmingPoolBuilder().buildPool());
    }

    @Override
    public void addGarden()  {
        System.out.println("Adding new garden");
        house.setGarden(new FlowerGardenBuilder().buildGarden());
    }


    @Override
    public House buildHouse()  {
        System.out.println("Please wait were building your house....!");
        try {
            Thread.sleep(2000);
            buildWall();
            Thread.sleep(2000);
            putStare();
            Thread.sleep(2000);
            paintWall();
            Thread.sleep(2000);
            addSwimmingPool();
            Thread.sleep(2000);
            addGarden();
            Thread.sleep(2000);
        }catch (Exception ignored){}

        System.out.println("Your House is Ready.....!");
        return house;
    }
}
