package com.pkg.pattern.store;

public enum Store {
    DOMINOS_PIZZA, PIZZA_EXPRESS, PIZZA_HOT, THE_PIZZA_CUTTER, WORLD_OF_PIZZA;

    @Override
    public String toString() {
        switch (this) {
            case DOMINOS_PIZZA:
                return "Domino's";
            case PIZZA_EXPRESS:
                return "Pizza Express";
            case PIZZA_HOT:
                return "Pizza Hot";
            case WORLD_OF_PIZZA:
                return "World Of Pizza";
            case THE_PIZZA_CUTTER:
                return "The Pizza Cutter";
            default:
                return "";
        }
    }


}
