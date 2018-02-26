package com.company;

public class Nokia3310 extends Phone{

    public Nokia3310(){
        touch = false;
        hasWiFi = false;
        screenSize = 2;
        name = "Nokia";
        sim = new SimCard(this);
    }
}
