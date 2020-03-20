package com.pkg.pattern.handler;

public interface Handler {
    void setNextHandler(Handler nextHandler);

    void handle(Enum incomingSuspect);
}
