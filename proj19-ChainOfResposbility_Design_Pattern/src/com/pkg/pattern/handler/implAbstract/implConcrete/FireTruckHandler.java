package com.pkg.pattern.handler.implAbstract.implConcrete;

import com.pkg.pattern.handler.implAbstract.AbstractHandler;
import com.pkg.pattern.handler.type.SuspectVehicleType;

public class FireTruckHandler extends AbstractHandler {

    @Override
    public void handle(Enum incomingSuspect) {
        System.out.println("Searching  in "+SuspectVehicleType.FIRE_TRUCK);
        if (incomingSuspect.equals(SuspectVehicleType.FIRE_TRUCK)) {
            System.out.println("validate id of "+incomingSuspect.toString());
            System.out.println("give access ");
            return;
        }
        this.nextHandler.handle(incomingSuspect);
    }
}
