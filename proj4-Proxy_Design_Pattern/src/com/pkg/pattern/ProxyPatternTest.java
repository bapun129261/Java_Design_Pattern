package com.pkg.pattern;

import com.pkg.pattern.proxy.SubjectProxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        SubjectProxy proxy=new SubjectProxy();
        proxy.doSomework();
    }
}
