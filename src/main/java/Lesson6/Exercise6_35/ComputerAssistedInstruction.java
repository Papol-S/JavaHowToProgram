package Lesson6.Exercise6_35;

import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        cAI();
    }

    public static void cAI () {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        System.out.printf("How much is %d time %d\n",x,y);
        int answer = input.nextInt();

        while (answer != x*y) {
            System.out.println("No! Please try again");
            answer = input.nextInt();
        }

        System.out.println("Very good!");
    }
}
