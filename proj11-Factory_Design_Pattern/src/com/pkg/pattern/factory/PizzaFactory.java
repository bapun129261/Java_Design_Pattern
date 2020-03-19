package com.pkg.pattern.factory;

import com.pkg.pattern.product.Pizza;

public interface PizzaFactory {
   Pizza getPizza(Enum type);
}
