package com.pkg.pattern.handler.implAbstract;

import com.pkg.pattern.handler.Handler;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler=nextHandler;
    }

}
