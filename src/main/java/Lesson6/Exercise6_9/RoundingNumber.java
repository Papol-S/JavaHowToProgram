package Lesson6.Exercise6_9;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        double value = input.nextDouble();
        System.out.printf("Value before rounding = %.2f\n",value);
        System.out.printf("Value after rounding = %d\n",rounding(value));

    }

    public static int rounding(double x) {
        int y = (int) Math.floor(x+0.5);
        return y;
    }
}
