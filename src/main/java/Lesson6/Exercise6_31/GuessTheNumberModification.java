package Lesson6.Exercise6_31;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModification {

    private static int count = 1;
    public static void main(String[] args) {
        guess();
    }

    public static void  guess () {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guess the number game !!");
        char again = 'y';
        while (again == 'y') {
            int number = 1 + random.nextInt(1000);
            System.out.print("Guess number -> ");
            int guessNumber = input.nextInt();
            while (guessNumber != number) {
                if (guessNumber < number) {
                    System.out.println("too low !!");
                    count++;
                } else if (guessNumber > number) {
                    System.out.println("too high !!");
                    count++;
                }
                System.out.print("Try again -> ");
                guessNumber = input.nextInt();
            }
            System.out.println("Congratulations !!");
            if (count < 10) {
                System.out.println("You got lucky !!");
                System.out.println(count);
            }
            else if (count == 10) {
                System.out.println("Aha !!");
                System.out.println(count);
            }
            else {
                System.out.println("You should be able to do better.");
                System.out.println(count);
            }
            System.out.println("Wanna play again ? (Y/N)");
            again = input.next().charAt(0);
        }
    }
}
