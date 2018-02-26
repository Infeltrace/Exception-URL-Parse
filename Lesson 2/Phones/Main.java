package com.company;

public class Main {

    public static void main(String[] args) {

        Phone nokia = new Nokia3310();
        Phone iphone = new IPhone();
        Phone samsung = new SamsungS4();

        nokia.call(samsung.getNumber());
        nokia.call(samsung.getNumber());

        samsung.call(iphone.getNumber());

        iphone.call(samsung.getNumber());
        iphone.call(samsung.getNumber());
        iphone.call(samsung.getNumber());
        iphone.call(samsung.getNumber());

        nokia.info();
        samsung.info();
        iphone.info();
    }
}
