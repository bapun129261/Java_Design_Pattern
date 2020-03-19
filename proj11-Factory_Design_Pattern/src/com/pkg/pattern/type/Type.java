package com.pkg.pattern.type;

public enum Type {
    CHEESE, CHICKEN, MUSHROOM;

    @Override
    public String toString() {
        switch (this) {
            case CHEESE:
                return "Cheese";
            case CHICKEN:
                return "Chicken";
            case MUSHROOM:
                return "Mushroom";
            default:
                return "";
        }
    }


}
