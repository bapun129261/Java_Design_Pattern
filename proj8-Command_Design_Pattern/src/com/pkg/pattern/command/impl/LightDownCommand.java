package com.pkg.pattern.command.impl;

import com.pkg.pattern.command.Icommand;
import com.pkg.pattern.receiver.LightBulb;

public class LightDownCommand implements Icommand {
    private LightBulb bulb;

    public LightDownCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        System.out.println(bulb.getCompanyName() + " bulb rise down light ");
    }

    @Override
    public void unExecute() {
//no operation
    }
}
