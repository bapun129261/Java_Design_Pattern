package com.pkg.pattern.extension.impl;

import com.pkg.pattern.extension.Extension;

public class ExtensionSubject2 extends Extension {
    @Override
    public void subjectStatus() {
        super.subjectStatus();
        System.out.println("im adding new functionlity from ExtensionSubject2");
    }
}
