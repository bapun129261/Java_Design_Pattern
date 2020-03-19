package com.pkg.pattern.state;

public interface State {
    void transitionTo(State state);

    void displayState();
}
