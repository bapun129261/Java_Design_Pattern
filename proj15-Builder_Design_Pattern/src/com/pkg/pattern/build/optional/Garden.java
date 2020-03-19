package com.pkg.pattern.build.optional;

public class Garden {
    private int area;
    private String name;
    private String type;


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
