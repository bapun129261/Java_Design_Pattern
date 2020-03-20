package com.pkg.pattern;


import com.pkg.pattern.handler.Handler;
import com.pkg.pattern.handler.implAbstract.implConcrete.AmbulanceVehicleHandler;
import com.pkg.pattern.handler.implAbstract.implConcrete.CivilianVehicleHandler;
import com.pkg.pattern.handler.implAbstract.implConcrete.FireTruckHandler;
import com.pkg.pattern.handler.implAbstract.implConcrete.PoliceSUVHandler;
import com.pkg.pattern.handler.type.SuspectVehicleType;

public class ChainOfResponsibilityPatternTest {
    public static void main(String[] args) {
        getValidationHandler().handle(SuspectVehicleType.POLICE_SUV);
    }

    public static Handler getValidationHandler() {
        Handler civilHandler = new CivilianVehicleHandler();
        Handler ambulanceHandler = new AmbulanceVehicleHandler();
        Handler fireTruckHandler = new FireTruckHandler();
        Handler policeSuvHandler = new PoliceSUVHandler();

        civilHandler.setNextHandler(ambulanceHandler);
        ambulanceHandler.setNextHandler(fireTruckHandler);
        fireTruckHandler.setNextHandler(policeSuvHandler);

        return civilHandler;
    }
}
