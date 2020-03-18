package com.pkg.pattern.subject;

import com.pkg.pattern.observer.Fan;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements ICelebrity {
    private List<Fan> fanList = null;

    public void setMsg(String msg) {
        notifyAllFan(msg);
    }

    String msg = null;

    public Celebrity() {
        this.fanList = new ArrayList<>();
    }

    @Override
    public void registerFan(Fan fan) {
        fanList.add(fan);
    }

    @Override
    public void unRegisterFan(int fanId) {
        for (Fan fan:fanList){
            if (fan.getId()==fanId){
                fanList.remove(fan);
            }
        }
    }

    @Override
    public void notifyAllFan(String msg) {
        for (Fan fan : fanList) {
            fan.updateCelebrityStatus(msg);
        }
    }
}
