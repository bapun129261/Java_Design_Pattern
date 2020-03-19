package com.pkg.pattern;


import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.factory.impl.abstracts.AbstractPizzaFactory;
import com.pkg.pattern.product.Pizza;
import com.pkg.pattern.store.Store;

public class FactoryPatternTest {
    public static void main(String[] args) {
        System.out.println(String.format("%1$15s %2$22s", "ITEM NAME", "PRICE"));
        System.out.println("---------------------------------------");

       PizzaFactory dominosPizzaFactory = AbstractPizzaFactory.getPizzaStore(Store.DOMINOS_PIZZA);
        Pizza cheesePizza = dominosPizzaFactory.createCheesePizza();
        Pizza chickenPizza = dominosPizzaFactory.createChickenPizza();
        Pizza mushroomPizza = dominosPizzaFactory.createMushroomPizza();

        PizzaFactory pizzaHot =  AbstractPizzaFactory.getPizzaStore(Store.PIZZA_HOT);
        Pizza pizzaHotcheesePizza = pizzaHot.createCheesePizza();
        Pizza pizzaHotchickenPizza = pizzaHot.createChickenPizza();
        Pizza pizzaHotmushroomPizza = pizzaHot.createMushroomPizza();


        System.out.println(String.format("%1$25s %2$12s", cheesePizza.getNameOfThePizza(), cheesePizza.getPrice()));
        System.out.println(String.format("%1$25s %2$12s", chickenPizza.getNameOfThePizza(), chickenPizza.getPrice()));
        System.out.println(String.format("%1$25s %2$12s", mushroomPizza.getNameOfThePizza(), mushroomPizza.getPrice()));

        System.out.println();
        System.out.println();
        System.out.println(String.format("%1$25s %2$12s", pizzaHotcheesePizza.getNameOfThePizza(), pizzaHotcheesePizza.getPrice()));
        System.out.println(String.format("%1$25s %2$12s", pizzaHotchickenPizza.getNameOfThePizza(), pizzaHotchickenPizza.getPrice()));
        System.out.println(String.format("%1$25s %2$12s", pizzaHotmushroomPizza.getNameOfThePizza(), pizzaHotmushroomPizza.getPrice()));

    }
}
