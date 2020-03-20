package com.pkg.pattern.mediator;

import com.pkg.pattern.component.Person;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {

    public abstract void notifyToPerson(Person sender,String msg);

    public abstract void registerPerson(Person person);
    public abstract String getSenderName() ;

}
