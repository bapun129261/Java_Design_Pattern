package com.pkg.pattern.adapter;

import com.pkg.pattern.charger.AndroidCharger;
import com.pkg.pattern.charger.AppleCharger;

public class AppleChargerAdapter implements AppleCharger {
    AndroidCharger charger = null;

    public AppleChargerAdapter(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhoneByWireless() {
        charger.chargePhoneByCable();
    }
}
