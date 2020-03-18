package com.pkg.pattern.captain.case3;

public class MakeACaptain {
    private static MakeACaptain aCaptain =null;

    //outsider can not create object by using new keyword
    private MakeACaptain() {
    }

    public static synchronized MakeACaptain getCaptain(){
        System.out.println("For thread safety");
        if (aCaptain==null){
            aCaptain=new MakeACaptain();
        }
        return aCaptain;
    }
}
