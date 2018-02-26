package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Operator {

    private static Map<Integer,SimCard> ablist = new HashMap<>();

    public static void findAbon(int number){
        if(ablist.get(number) != null) {
            ablist.get(number).call();
        } else System.out.println("Такого абонента не найдено");
    }

    public static int setNumber(SimCard card){
        int number;
        Random random = new Random();
        while (true) {
             number = random.nextInt(100000);
            if (number > 9999) {
                ablist.put(number,card);
                return  number;
            }
        }

    }
}
