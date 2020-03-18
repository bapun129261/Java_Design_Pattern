package com.pkg.pattern.subject;

import com.pkg.pattern.observer.Fan;

public interface ICelebrity {
    void registerFan(Fan fan);
    void unRegisterFan(int fanId);
    void notifyAllFan(String msg);
}
