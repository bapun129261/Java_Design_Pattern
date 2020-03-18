package com.pkg.pattern.captain.case1;

public class MakeACaptain {
    private static MakeACaptain aCaptain=null;
    //outsider can not create object by using new keyword
    private MakeACaptain() {
    }
//Lazy initialization
    public static MakeACaptain getCaptain(){

        if (aCaptain==null){
            aCaptain=new MakeACaptain();
        }
        return aCaptain;
    }
}
