package com.pkg.pattern.handler.implAbstract.implConcrete;

import com.pkg.pattern.handler.implAbstract.AbstractHandler;
import com.pkg.pattern.handler.type.SuspectVehicleType;

public class CivilianVehicleHandler extends AbstractHandler {
    @Override
    public void handle(Enum incomingSuspect) {
        System.out.println("Searching  in "+SuspectVehicleType.CIVILIAN_SUV);
        if (incomingSuspect.equals(SuspectVehicleType.CIVILIAN_SUV)) {
            System.out.println("validate id of "+incomingSuspect.toString());
            System.out.println("Minor integration");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
