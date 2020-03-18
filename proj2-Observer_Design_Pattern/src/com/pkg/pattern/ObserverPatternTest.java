package com.pkg.pattern;

import com.pkg.pattern.observer.Fan;
import com.pkg.pattern.subject.Celebrity;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity();
        for (int i = 1; i < 5; i++) {
            Fan fan = new Fan();
            fan.setId(10 * i);
            fan.setName("fan" + i);
            celebrity.registerFan(fan);
        }
        celebrity.setMsg("How are you");
        celebrity.unRegisterFan(30);
        celebrity.setMsg("Bye Bye See you..!");

    }

}
