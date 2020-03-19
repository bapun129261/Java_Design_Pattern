package com.pkg.pattern.builder.houseBuilder.impl;

import com.pkg.pattern.build.House;
import com.pkg.pattern.builder.houseBuilder.HouseBuilder;

public class ClayHouseBuilder implements HouseBuilder {
    House house;

    public ClayHouseBuilder() {
        initHouse();
    }

    @Override
    public void initHouse() {
        this.house = new House();
    }

    @Override
    public void buildWall() {
        house.setFloor(1);
        house.setHeight(600);
        house.setWidth(700);
        house.setWallType("Clay");
    }

    @Override
    public void paintWall() {
        house.setWallColor("Not Required");

    }

    @Override
    public void putStare() {
        house.setRequiredStare(false);
    }

    @Override
    public void addSwimmingPool() {
        System.out.println("Not Required");
    }

    @Override
    public void addGarden() {
        System.out.println("Not Required");
    }


    @Override
    public House buildHouse() {
        return house;
    }
}
