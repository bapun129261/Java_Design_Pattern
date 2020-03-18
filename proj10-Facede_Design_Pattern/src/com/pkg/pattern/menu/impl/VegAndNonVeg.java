package com.pkg.pattern.menu.impl;

import com.pkg.pattern.menu.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class VegAndNonVeg implements Menu {

    private Map<String, Double> itemsNameAndPriceList;

    {
        itemsNameAndPriceList=new HashMap<>();
        itemsNameAndPriceList.put("Chicken", 150d);
        itemsNameAndPriceList.put("Mutton", 320d);
        itemsNameAndPriceList.put("ChickenChilly", 220d);
        itemsNameAndPriceList.put("Chicken Kebab", 250d);
        itemsNameAndPriceList.put("chicken lollipop", 180d);
        itemsNameAndPriceList.put("Dal", 50d);
        itemsNameAndPriceList.put("VegKarma", 160d);
        itemsNameAndPriceList.put("CornCurry", 220d);
        itemsNameAndPriceList.put("Veg Kebab", 130d);
        itemsNameAndPriceList.put("Pinier", 180d);
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
