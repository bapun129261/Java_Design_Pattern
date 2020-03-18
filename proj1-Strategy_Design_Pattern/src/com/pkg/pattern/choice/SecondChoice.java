package com.pkg.pattern.choice;

public class SecondChoice implements MyChoice{
    @Override
    public void myChoice(String str1, String str2) {
        System.out.println("Going concat it...!");
        System.out.println("concat of "+str1+" + "+str2+" is "+str1.concat(str2));
    }
}
