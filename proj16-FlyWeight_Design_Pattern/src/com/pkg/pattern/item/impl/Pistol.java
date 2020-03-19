package com.pkg.pattern.item.impl;

import com.pkg.pattern.item.Gun;
import com.pkg.pattern.type.BulletType;

public class Pistol extends Gun {
    public Pistol(int capacity, BulletType bulletType) {
        super(capacity, bulletType);
    }

    @Override
    public void shoot() {
        for (int i = 0; i < this.capacity; i++) {
            System.out.println(this.bullets[i].toString());
        }

    }
}
