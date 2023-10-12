package com.pluralsight;

public class Dice {

    int number;

    public Dice(){
        number = 0;
    }

    public int roll(){
        int roll = 1 + (int)(Math.random() * 6);



        return roll;
    }


}
