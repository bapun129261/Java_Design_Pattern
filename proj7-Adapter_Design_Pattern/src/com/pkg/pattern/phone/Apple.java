package com.pkg.pattern.phone;

import com.pkg.pattern.charger.AppleCharger;

public class Apple implements AppleCharger {
    @Override
    public void chargePhoneByWireless() {
        System.out.println("charge  phone by using wireless charger");
    }
}
