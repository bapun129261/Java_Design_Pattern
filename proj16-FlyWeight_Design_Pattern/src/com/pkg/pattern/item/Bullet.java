package com.pkg.pattern.item;

public class Bullet {
    private String size;
    private String weight;

    public Bullet(String size, String weight) {
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.valueOf(this.hashCode());
    }
}
