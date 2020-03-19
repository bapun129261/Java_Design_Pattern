package com.pkg.pattern.item;

import com.pkg.pattern.factory.BulletFactory;
import com.pkg.pattern.type.BulletType;

public abstract class Gun {
    protected Bullet[] bullets;
    protected int capacity;
    protected BulletType bulletType;

    public Gun(int capacity, BulletType bulletType) {
        this.capacity = capacity;
        this.bulletType = bulletType;
        bullets=new Bullet[capacity];
    }

    public void loadBullet() {
        for (int i = 0; i < capacity; i++) {
           bullets[i]= BulletFactory.getBulletFromCache(bulletType);
        }
    }

    public void loadUnCacheBullet() {
        for (int i = 0; i < capacity; i++) {
            bullets[i]= BulletFactory.getBulletByType(bulletType);
        }
    }

    public abstract void shoot();

}
