package com.pkg.pattern.composite.impl;

import com.pkg.pattern.composite.SurpriseGift;

import java.util.ArrayList;
import java.util.List;

public class GiftSurpriseBox implements SurpriseGift {
    private List<SurpriseGift> surpriseGifts;

    public GiftSurpriseBox() {
        this.surpriseGifts = new ArrayList<>();
    }

    @Override
    public void unWarpGift() {
        surpriseGifts.forEach(SurpriseGift::unWarpGift);
    }

    public void addGift(SurpriseGift gift) {
        surpriseGifts.add(gift);
    }

    public void removeGift(SurpriseGift gift) {
        surpriseGifts.remove(gift);
    }
}
