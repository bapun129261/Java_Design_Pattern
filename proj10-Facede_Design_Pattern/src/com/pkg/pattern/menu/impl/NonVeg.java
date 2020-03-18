package com.pkg.pattern.menu.impl;

import com.pkg.pattern.menu.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NonVeg implements Menu {
    private Map<String, Double> itemsNameAndPriceList;

    {
        itemsNameAndPriceList=new HashMap<>();
        itemsNameAndPriceList.put("Chicken", 150d);
        itemsNameAndPriceList.put("Mutton", 320d);
        itemsNameAndPriceList.put("ChickenChilly", 220d);
        itemsNameAndPriceList.put("Chicken Kebab", 250d);
        itemsNameAndPriceList.put("chicken lollipop", 180d);
    }


    @Override
    public Set<String> menuName() {
        return itemsNameAndPriceList.keySet();
    }

    @Override
    public List<Double> menuPrice() {
        return  itemsNameAndPriceList.values().stream().collect(Collectors.toList());
    }

    public Map<String, Double> getItemsNameAndPrice() {
        return itemsNameAndPriceList;
    }
}
