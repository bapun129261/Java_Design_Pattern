package com.pkg.pattern;


import com.pkg.pattern.item.Gun;
import com.pkg.pattern.item.impl.ShootGun;
import com.pkg.pattern.type.BulletType;

public class FlyWeightPatternTest {
    public static void main(String[] args) {
        Gun shootGun =new ShootGun(10, BulletType.SHOTGUN);
        System.out.println("Load from Cache");
        shootGun.loadBullet();
        shootGun.shoot();

        System.out.println("Not Load from Cache");
        shootGun.loadUnCacheBullet();
        shootGun.shoot();
    }
}
