package com.pkg.pattern;

import com.pkg.pattern.captain.case1.MakeACaptain;


public class SingletonPatternTest {

    public static void main(String[] args) {
        System.out.println("lazy initialization");
        System.out.println(MakeACaptain.getCaptain().hashCode() + " == " + MakeACaptain.getCaptain().hashCode());
        System.out.println("Eager initialization");
        System.out.println(com.pkg.pattern.captain.case2.MakeACaptain.getCaptain().hashCode() + " == " + com.pkg.pattern.captain.case2.MakeACaptain.getCaptain().hashCode());
        System.out.println("Static inner class");
        System.out.println(com.pkg.pattern.captain.case4.MakeACaptain.getCaptain().hashCode() + " == " + com.pkg.pattern.captain.case4.MakeACaptain.getCaptain().hashCode());

    }

}
