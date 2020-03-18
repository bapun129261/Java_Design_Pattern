package com.pkg.pattern.adapter;

import com.pkg.pattern.charger.AndroidCharger;
import com.pkg.pattern.charger.AppleCharger;

public class AndroidChargerAdapter implements AndroidCharger {
    AppleCharger charger;

    public AndroidChargerAdapter(AppleCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhoneByCable() {
        charger.chargePhoneByWireless();
    }
}
