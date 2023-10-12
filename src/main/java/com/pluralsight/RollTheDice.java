package com.pluralsight;

public class RollTheDice {

    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1;
        int roll2;

        int two = 0;
        int four = 0;
        int six = 0;
        int seven = 0;
        int sum;
        for(int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            if(sum == 2){
                two++;
            }
            else if(sum == 4){
                four++;
            }
            else if(sum == 6){
                six++;
            }
            else if(sum == 7){
                seven++;
            }

            System.out.print("Roll " + i + ":  " + roll1 + "  - " + roll2 + "  Sum: " + sum + "  \n");

        }

        System.out.println("sums of two's: " + two);
        System.out.println("sums of four's: " + four);
        System.out.println("sums of six's: " + six);
        System.out.println("sums of seven's: " + seven);

    }


}
