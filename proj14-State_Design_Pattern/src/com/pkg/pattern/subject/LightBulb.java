package com.pkg.pattern.subject;

import com.pkg.pattern.state.State;
import com.pkg.pattern.state.impl.OffState;
import com.pkg.pattern.state.impl.OnState;

import java.util.HashMap;
import java.util.Map;

public class LightBulb {
    private Map<State, State> lightBulbState = new HashMap<>();
    private State currentState;

    public LightBulb() {
        State onState = new OnState(this);
        State offState = new OffState(this);
        lightBulbState.put(onState, offState);
        lightBulbState.put(offState, onState);
        currentState = offState;
    }

    public void setLightBulbCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void displayState() {
        this.currentState.displayState();
    }

    public void toggle() {
        this.currentState.transitionTo(lightBulbState.get(currentState));
    }
}
