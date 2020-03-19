package com.pkg.pattern.builder.poolBuilder;

import com.pkg.pattern.build.optional.SwimmingPool;

public interface PoolBuilder {
    SwimmingPool buildPool() throws InterruptedException;

    void putAllPoolElement();

    void initPool();
}
