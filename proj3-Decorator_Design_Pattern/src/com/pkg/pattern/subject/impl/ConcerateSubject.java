package com.pkg.pattern.subject.impl;

import com.pkg.pattern.subject.MainSubject;

public class ConcerateSubject extends MainSubject {
    @Override
    public void subjectStatus() {
        System.out.println("Hey iam from ConcerateSubject ,Closed for Modification ");
    }
}
