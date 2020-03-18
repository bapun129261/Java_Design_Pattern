package com.pkg.pattern.captain.case4;

public class MakeACaptain {


    //outsider can not create object by using new keyword
    private MakeACaptain() {
    }

    public static class SingletonHelper{
        private static final MakeACaptain aCaptain =new MakeACaptain();
    }
    public static synchronized MakeACaptain getCaptain(){

        return SingletonHelper.aCaptain;
    }
}
