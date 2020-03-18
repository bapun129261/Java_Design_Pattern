package com.pkg.pattern.command.impl;

import com.pkg.pattern.command.Icommand;
import com.pkg.pattern.receiver.LightBulb;

public class LightUpCommand implements Icommand {
    private LightBulb bulb;

    public LightUpCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        System.out.println(bulb.getCompanyName() + " bulb rise up light ");

    }

    @Override
    public void unExecute() {
       //no operation
    }
}
