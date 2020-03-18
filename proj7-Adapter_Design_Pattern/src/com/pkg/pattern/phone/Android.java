package com.pkg.pattern.phone;

import com.pkg.pattern.charger.AndroidCharger;

public class Android implements AndroidCharger {
    @Override
    public void chargePhoneByCable() {
        System.out.println("charge  phone by using cable");
    }
}
