package com.company;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWiFi;
    protected int screenSize;
    protected String name;
    protected SimCard sim;
    private int countInCall, countSMS, countOutCall;


    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getName() {
        return name;
    }

    public void call(int number){
        System.out.println(getName() +" is calling to " + number);
        countOutCall++;
        Operator.findAbon(number);
    }

    public void sendSMS(String message, int number){
        System.out.println(getName() +" is sending SMS " + message + " Hello to " + number);
        countSMS++;
    }
    public void answer(){
        System.out.println("Incoming call");
        countInCall++;
    }

    public void info(){
        System.out.println("Phone name: " + getName() + "\n Number: " + getNumber() + "\n Out calls: " + countOutCall + "\n Incoming calls: " + countInCall);
    }

    public int getNumber(){
        return sim.getNumber();
    }
}
