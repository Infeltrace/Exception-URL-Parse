package com.company;

public class SimCard {

    private int number;
    private Phone phone;

    public SimCard(Phone p) {
        number = Operator.setNumber(this);
        phone = p;
    }

    public int getNumber() {
        return number;
    }
    public void call(){
        phone.answer();
    }
}
