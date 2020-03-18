package com.pkg.pattern.extension;

import com.pkg.pattern.subject.MainSubject;

public abstract class Extension extends MainSubject {
    MainSubject subject=null;

    public void setSubject(MainSubject subject) {
        this.subject = subject;
    }

    @Override
    public void subjectStatus() {
        subject.subjectStatus();
    }
}
