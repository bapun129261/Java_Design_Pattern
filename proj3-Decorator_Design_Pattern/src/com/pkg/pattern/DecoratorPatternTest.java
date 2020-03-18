package com.pkg.pattern;


import com.pkg.pattern.extension.Extension;
import com.pkg.pattern.extension.impl.ExtensionSubject1;
import com.pkg.pattern.extension.impl.ExtensionSubject2;
import com.pkg.pattern.subject.MainSubject;
import com.pkg.pattern.subject.impl.ConcerateSubject;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Extension extension = null;
        MainSubject mainSubject = null;
        mainSubject = new ConcerateSubject();
        mainSubject.subjectStatus();
        System.out.println("Add New Extension ");
        extension=new ExtensionSubject1();
        extension.setSubject(mainSubject);
        extension.subjectStatus();

        System.out.println("Add New Extension ");
        extension=new ExtensionSubject2();
        extension.setSubject(mainSubject);
        extension.subjectStatus();
    }
}
