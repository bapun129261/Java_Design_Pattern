package com.pkg.pattern.builder.houseBuilder;

import com.pkg.pattern.build.House;

public interface HouseBuilder {
    void buildWall();

    void paintWall();

    void putStare();

    void addSwimmingPool() ;
    void addGarden() ;
    void initHouse();
    House buildHouse() ;
}
