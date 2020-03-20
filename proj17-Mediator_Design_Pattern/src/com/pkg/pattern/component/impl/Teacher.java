package com.pkg.pattern.component.impl;

import com.pkg.pattern.component.Person;
import com.pkg.pattern.component.type.PersonType;
import com.pkg.pattern.mediator.Mediator;

public class Teacher extends Person {


    public Teacher(Mediator mediator) {
        super(mediator, PersonType.TEACHER);
    }

    @Override
    public void send(String message) {
        this.mediator.notifyToPerson(this,message);

    }

    @Override
    public void receive(String message) {
        System.out.println("Teacher get Message From "+mediator.getSenderName()+" :"+message);

    }

}
