package com.pkg.pattern.builder.gardenBuilder;

import com.pkg.pattern.build.optional.Garden;

public interface GardenBuilder {
    void putGardenItems();
    void initGarden();
    Garden buildGarden() throws InterruptedException;
}
