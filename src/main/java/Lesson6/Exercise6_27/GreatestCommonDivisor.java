package Lesson6.Exercise6_27;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value -> ");
        int x = input.nextInt();
        System.out.print("Enter second value -> ");
        int y = input.nextInt();
        greatestCommonDivisor(x,y);
    }

    public static void greatestCommonDivisor (int x , int y) {
        int max = Math.max(x, y);
        int min = Math.min(x,y);
        int gCD = 0;

        while (max%min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        System.out.println("GCD is "+min);
    }
}
