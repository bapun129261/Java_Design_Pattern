package com.pkg.pattern.build.optional;

public class SwimmingPool {
    private int area;
    private String color;
    private int depth;


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "SwimmingPool{" +
                "area=" + area +
                ", color='" + color + '\'' +
                ", depth=" + depth +
                '}';
    }
}
