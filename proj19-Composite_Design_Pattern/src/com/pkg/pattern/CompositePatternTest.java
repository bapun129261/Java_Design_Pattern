package com.pkg.pattern;

import com.pkg.pattern.composite.impl.Gift;
import com.pkg.pattern.composite.impl.GiftSurpriseBox;

public class CompositePatternTest {
    public static void main(String[] args) {
        GiftSurpriseBox firstBox = new GiftSurpriseBox();
        GiftSurpriseBox firstInsideBox = new GiftSurpriseBox();
        GiftSurpriseBox firstInsideBoxInsideBox = new GiftSurpriseBox();
        GiftSurpriseBox firstInsideBoxInsideBoxInside = new GiftSurpriseBox();
        firstBox.addGift(new Gift("plastic toy Boy"));
        firstBox.addGift(new Gift("plastic toy girl"));

        firstInsideBox.addGift(new Gift("glass  toy Boy"));
        firstInsideBox.addGift(new Gift("glass  toy girl"));

        firstInsideBoxInsideBox.addGift(new Gift("steel  toy Boy"));
        firstInsideBoxInsideBox.addGift(new Gift("steel  toy girl"));

        firstInsideBoxInsideBoxInside.addGift(new Gift("metal  toy Boy"));
        firstInsideBoxInsideBoxInside.addGift(new Gift("metal  toy girl"));

        firstBox.addGift(firstInsideBox);
        firstInsideBox.addGift(firstInsideBoxInsideBox);
        firstInsideBoxInsideBox.addGift(firstInsideBoxInsideBoxInside);


        firstBox.unWarpGift();

    }
}
