package Lesson7.Exercise7_18;

import java.util.Random;
import java.util.Scanner;

public class CrapsGameModificationCount {
    private static int[][] frequency = new int[200][2];
    private static  final Random randomNumber = new Random();
    private enum Status {CONTINUE , WON , LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            int j = 1;
            int myPoint = 0;
            Status gameStatus;
            int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                ++frequency[1][0];
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                ++frequency[1][1];
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        }
        while (gameStatus == Status.CONTINUE) {

            sumOfDice = rollDice();
            j++;
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
                ++frequency[j][0];
            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
                ++frequency[j][1];
            }
        }
    }
        display();
    }

    public static int rollDice () {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;
        return sum;
    }

    public static void display () {
        System.out.println("Summary all possibility");
        System.out.printf("%12s%12s%12s\n","Game count","win","lost");
        for (int i = 1; i <= 100; i++) {
                System.out.printf("%12d%12d%12d\n",i,frequency[i][0],frequency[i][1]);
        }
        int sum =0;
        int winSum = 0;
        int lossSum = 0;
        for (int i = 1; i < frequency.length;  i++) {
            winSum += frequency[i][0];
            lossSum += frequency[i][1];
            for (int j = 0; j < frequency[i].length; j++) {
                sum+=frequency[i][j];
            }
        }

        System.out.printf("Total game count is %d\n",sum);
        System.out.printf("Change of winning game is %d\n",winSum);
        System.out.printf("Change of losing game is %d\n",lossSum);
    }

}
