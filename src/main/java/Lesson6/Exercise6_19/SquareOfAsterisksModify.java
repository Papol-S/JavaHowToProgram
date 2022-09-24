package Lesson6.Exercise6_19;

import java.util.Scanner;

public class SquareOfAsterisksModify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        int number = input.nextInt();
        System.out.print("Enter char -> ");
        char fill = input.next().charAt(0);
        squareOfAsterisksModify(number,fill);
    }

    public static void squareOfAsterisksModify (int x, char fill) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
}
