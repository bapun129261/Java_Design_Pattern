package com.pkg.pattern.context;

import com.pkg.pattern.choice.MyChoice;

public class MyContext {
    MyChoice choice = null;

    public void setChice(MyChoice choice) {
        this.choice = choice;
    }

    public void showChoice(String str1, String str2) {
        choice.myChoice(str1, str2);
    }
}
