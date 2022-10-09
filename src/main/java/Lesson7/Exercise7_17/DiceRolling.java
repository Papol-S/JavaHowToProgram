package Lesson7.Exercise7_17;

import java.util.Random;

public class DiceRolling {
    private static int[] frequency = new int [13];
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 36000000; i++) {
            rollDices();
        }
        display();
    }

    public static void rollDices () {
        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);
        int sum = dice1+dice2;
        ++frequency[sum];
    }

    public static void display () {
        System.out.println("All possibility");
        for (int i = 2; i < 13; i++) {
            System.out.printf("In case result %2d : %d times\n",i,frequency[i]);

        }
    }
}
