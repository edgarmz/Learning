package com.example.Beans.mobileCarrier;

import com.example.Beans.interfaces.mobile;

public class Telcel implements mobile {
    @Override
    public void message() {
        System.out.println("Sending a message...");
    }
    @Override
    public void balance() {
        System.out.println("Your Balance is 120.00");
    }
}
