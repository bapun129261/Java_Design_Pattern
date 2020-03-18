package com.pkg.pattern.choice;

public class FirstChoice implements MyChoice{
    @Override
    public void myChoice(String str1, String str2) {

        System.out.println("Going to Add..!");
        System.out.println("Sum of to number is : "+((Integer.parseInt(str1))+(Integer.parseInt(str2))));
    }
}
