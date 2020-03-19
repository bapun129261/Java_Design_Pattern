package com.pkg.pattern;


import com.pkg.pattern.factory.PizzaFactory;
import com.pkg.pattern.factory.impl.DominosPizzaFactory;
import com.pkg.pattern.product.Pizza;
import com.pkg.pattern.type.Type;

public class FactoryPatternTest {
    public static void main(String[] args) {
      Pizza pizza= new DominosPizzaFactory().getPizza(Type.CHEESE);
        System.out.println(pizza.getClass().getName());
        System.out.println(pizza.getNameOfThePizza()+" : "+pizza.getPrice());
    }
}
