package com.pkg.pattern.composite.impl;

import com.pkg.pattern.composite.SurpriseGift;

public class Gift implements SurpriseGift {
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    @Override
    public void unWarpGift() {
        System.out.println("Unwrapping Gift :" + this.name);
    }
}
