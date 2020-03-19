package com.pkg.pattern.factory;

import com.pkg.pattern.item.Bullet;
import com.pkg.pattern.type.BulletType;

import java.util.HashMap;
import java.util.Map;

public abstract class BulletFactory {
    private static Map<BulletType, Bullet> bulletInCache = new HashMap<>();


    public static Bullet getBulletByType(BulletType bulletType) {
        switch (bulletType) {
            case PISTOL:
                return new Bullet("S", "50gm");
            case SHOTGUN:
                return new Bullet("M", "80gm");
            case SNIPER:
                return new Bullet("L", "100gm");
            default:
                throw new RuntimeException("Type is invalid");
        }
    }

    public static Bullet getBulletFromCache(BulletType bulletType) {
        if (bulletInCache.containsKey(bulletType)) {
            return bulletInCache.get(bulletType);
        }
        bulletInCache.put(bulletType, getBulletByType(bulletType));
        return bulletInCache.get(bulletType);
    }
}
