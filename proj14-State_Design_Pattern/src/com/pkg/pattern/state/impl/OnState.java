package com.pkg.pattern.state.impl;

import com.pkg.pattern.state.State;
import com.pkg.pattern.subject.LightBulb;

public class OnState implements State {
    private LightBulb lightBulb;

    public OnState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void transitionTo(State nextState) {
        this.lightBulb.setLightBulbCurrentState(nextState);
    }

    @Override
    public void displayState() {
        System.out.println("LightBulb is on");
    }
}
