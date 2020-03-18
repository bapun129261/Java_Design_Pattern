package com.pkg.pattern.proxy;

import com.pkg.pattern.subject.MainAbstractSubject;
import com.pkg.pattern.subject.impl.ConcreteSubject;

public class SubjectProxy extends MainAbstractSubject {
    MainAbstractSubject subject = null;

    public SubjectProxy() {
        System.out.println("SubjectProxy object is created");
    }

    @Override
    public void doSomework() {
        System.out.println("All happens through SubjectProxy");
        if (subject == null) {
            subject = new ConcreteSubject();
        }
        subject.doSomework();
    }
}
