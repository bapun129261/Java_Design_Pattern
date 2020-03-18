package com.pkg.pattern.menu.impl;

import com.pkg.pattern.menu.Menu;

import java.util.*;
import java.util.stream.Collectors;

public class Veg implements Menu {
    private Map<String, Double> itemsNameAndPriceList;

    {
        itemsNameAndPriceList=new HashMap<>();
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
       /* List<Double> list=new ArrayList(itemsNameAndPriceList.values());*/
        return  itemsNameAndPriceList.values().stream().collect(Collectors.toList());
    }

    public Map<String, Double> getItemsNameAndPrice() {
        return itemsNameAndPriceList;
    }
}
