package com.pkg.pattern.handler.implAbstract.implConcrete;

import com.pkg.pattern.handler.implAbstract.AbstractHandler;
import com.pkg.pattern.handler.type.SuspectVehicleType;

public class PoliceSUVHandler extends AbstractHandler {

    @Override
    public void handle(Enum incomingSuspect) {
        System.out.println("Searching  in "+SuspectVehicleType.POLICE_SUV);
        if (incomingSuspect.equals(SuspectVehicleType.POLICE_SUV)) {
            System.out.println("validate id of " + incomingSuspect.toString());
            System.out.println("Give access");
            return;
        }

        throw new RuntimeException("Vehicle type " + incomingSuspect);
    }
}
