package Lesson6.Exercise6_18;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        squareOfAsterisks(input.nextInt());
    }

    public static void squareOfAsterisks (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
