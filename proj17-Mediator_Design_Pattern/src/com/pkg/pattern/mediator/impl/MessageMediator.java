package com.pkg.pattern.mediator.impl;

import com.pkg.pattern.component.Person;
import com.pkg.pattern.component.type.PersonType;
import com.pkg.pattern.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageMediator extends Mediator {
    private Map<Enum, Person> communicate = new HashMap<>();
    private String senderName;

    @Override
    public void notifyToPerson(Person sender, String msg) {
        senderName=sender.getNAME().toString();
        for (Enum aPerson :PersonType.values()){
            if (sender.getNAME().equals(aPerson)) {
                communicate.get(PersonType.getPartner(aPerson)).receive(msg);
            }
        }

/*

        if (sender.getNAME().equals(PersonType.STUDENT)) {
            communicate.get(PersonType.TEACHER).receive(msg);
        } else if (sender.getNAME().equals(PersonType.TEACHER)) {
            communicate.get(PersonType.STUDENT).receive(msg);
        } else if (sender.getNAME().equals(PersonType.COLLEAGUE)) {
            communicate.get(PersonType.TEACHER).receive(msg);
        } else {
            System.out.println("Invalid Receiver..!");
        }*/
    }

    @Override
    public void registerPerson(Person person) {
        communicate.put(person.getNAME(), person);
    }

    public String getSenderName() {
        return senderName;
    }
}
