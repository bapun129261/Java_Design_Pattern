package com.pkg.pattern.captain.case2;

public class MakeACaptain {
    private static final MakeACaptain aCaptain = new MakeACaptain();

    //outsider can not create object by using new keyword
    private MakeACaptain() {
    }

    //Eager initialization
    public static MakeACaptain getCaptain() {

        return aCaptain;
    }
}
