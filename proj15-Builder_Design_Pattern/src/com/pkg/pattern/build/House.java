package com.pkg.pattern.build;

import com.pkg.pattern.build.optional.Garden;
import com.pkg.pattern.build.optional.SwimmingPool;

public class House {
    private double height;
    private double width;
    private String wallType;
    private String wallColor;
    private int floor;
    private boolean isRequiredStare;
    private SwimmingPool swimmingPool;
    private Garden garden;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getWallType() {
        return wallType;
    }

    public void setWallType(String wallType) {
        this.wallType = wallType;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isRequiredStare() {
        return isRequiredStare;
    }

    public void setRequiredStare(boolean requiredStare) {
        isRequiredStare = requiredStare;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "House{" +
                "height=" + height +
                ", width=" + width +
                ", wallType='" + wallType + '\'' +
                ", wallColor='" + wallColor + '\'' +
                ", floor=" + floor +
                ", isRequiredStare=" + isRequiredStare +
                ", swimmingPool=" + swimmingPool +
                ", garden=" + garden +
                '}';
    }
}
