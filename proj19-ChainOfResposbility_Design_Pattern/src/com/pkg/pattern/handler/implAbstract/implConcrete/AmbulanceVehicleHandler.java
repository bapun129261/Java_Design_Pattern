package com.pkg.pattern.handler.implAbstract.implConcrete;

import com.pkg.pattern.handler.implAbstract.AbstractHandler;
import com.pkg.pattern.handler.type.SuspectVehicleType;

public class AmbulanceVehicleHandler extends AbstractHandler {

    @Override
    public void handle(Enum incomingSuspect) {
        System.out.println("Searching  in "+SuspectVehicleType.AMBULANCE);
        if (incomingSuspect.equals(SuspectVehicleType.AMBULANCE)) {
            System.out.println("validate id of "+incomingSuspect.toString());
            System.out.println("Minor integration");
            System.out.println("Check patient");

            return;
        }

        this.nextHandler.handle(incomingSuspect);
    }
}
