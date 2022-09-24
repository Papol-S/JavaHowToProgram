package Lesson6.Exercise6_16;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 -> ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2 -> ");
        int number2 = input.nextInt();
        System.out.println(isMultiple(number1,number2));
    }

    public static boolean isMultiple (int x , int y) {
        boolean result = false;
        if (x%y == 0) {
            result = true;
        }
        return result;
    }
}
