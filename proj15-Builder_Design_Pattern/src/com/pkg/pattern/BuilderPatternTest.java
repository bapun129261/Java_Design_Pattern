package com.pkg.pattern;

import com.pkg.pattern.build.House;
import com.pkg.pattern.builder.houseBuilder.impl.BuildingBuilder;

public class BuilderPatternTest {
    public static void main(String[] args) throws InterruptedException {
        House house=new BuildingBuilder().buildHouse();
       // System.out.println(house);

    }
}
