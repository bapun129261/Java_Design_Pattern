package com.pkg.pattern.builder.poolBuilder.impl;

import com.pkg.pattern.build.optional.SwimmingPool;
import com.pkg.pattern.builder.poolBuilder.PoolBuilder;

public class SwimmingPoolBuilder implements PoolBuilder {
    private SwimmingPool swimmingPool;

    public SwimmingPoolBuilder() {
        initPool();
    }

    @Override
    public void initPool() {
        this.swimmingPool = new SwimmingPool();
    }

    @Override
    public SwimmingPool buildPool() {
        System.out.println("Now were creating Swimming pool");
        try {
            Thread.sleep(2000);
            putAllPoolElement();
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println("Your Swimming pool is Ready.....!");
        return swimmingPool;
    }

    @Override
    public void putAllPoolElement() {
        System.out.println("putting all Element");
        swimmingPool.setArea(3500);
        swimmingPool.setColor("white");
        swimmingPool.setDepth(12);
    }


}
