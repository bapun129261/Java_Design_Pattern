package com.pkg.pattern;


import com.pkg.pattern.subject.LightBulb;

public class StatePatternTest {
    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        lightBulb.displayState();


        lightBulb.toggle();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();
        lightBulb.toggle();
        lightBulb.displayState();


    }


}
