package com.pkg.pattern.command.impl;

import com.pkg.pattern.command.Icommand;
import com.pkg.pattern.receiver.LightBulb;

public class LightOffCommand implements Icommand {
    private LightBulb bulb;

    public LightOffCommand(LightBulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {

        System.out.println(bulb.getCompanyName()+" bulb on");
    }

    @Override
    public void unExecute() {

        System.out.println(bulb.getCompanyName()+" bulb off");
    }
}
