package Lesson6.Exercise6_30;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        guess();
    }

    public static void  guess () {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guess the number game !!");
        char again = 'y';
        while (again == 'y') {
            int number = 1 + random.nextInt(10);
            System.out.print("Guess number -> ");
            int guessNumber = input.nextInt();
            while (guessNumber != number) {
                if (guessNumber < number) {
                    System.out.println("too low !!");
                } else if (guessNumber > number) {
                    System.out.println("too high !!");
                }
                System.out.print("Try again -> ");
                guessNumber = input.nextInt();
            }
            System.out.println("Congratulations !!");
            System.out.println("Wanna play again ? (Y/N)");
            again = input.next().charAt(0);
        }
    }
}
