package com.pkg.pattern;

import com.pkg.pattern.adapter.AndroidChargerAdapter;
import com.pkg.pattern.adapter.AppleChargerAdapter;
import com.pkg.pattern.charger.AndroidCharger;
import com.pkg.pattern.charger.AppleCharger;
import com.pkg.pattern.phone.Android;
import com.pkg.pattern.phone.Apple;

public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("Charge apple phone by apple charger");
        AppleCharger appleCharger=new Apple();
        appleCharger.chargePhoneByWireless();

        System.out.println();
        System.out.println();

        System.out.println("Charge android phone by android charger");
        AndroidCharger androidCharger=new Android();
        androidCharger.chargePhoneByCable();

        System.out.println();
        System.out.println();

        System.out.println("Charge android phone by apple charger");
        AndroidChargerAdapter androidChargerAdapter=new AndroidChargerAdapter(new Apple());
        androidChargerAdapter.chargePhoneByCable();
        System.out.println();
        System.out.println();

        System.out.println("Charge apple phone by android charger");
        AppleChargerAdapter appleChargerAdapter=new AppleChargerAdapter(new Android());
        appleChargerAdapter.chargePhoneByWireless();


    }
}
