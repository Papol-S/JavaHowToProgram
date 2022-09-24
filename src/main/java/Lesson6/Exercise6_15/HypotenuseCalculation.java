package Lesson6.Exercise6_15;

import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 -> ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 -> ");
        double side2 = input.nextDouble();
        System.out.println("Result by manual class "+hypoCalc(side1,side2));

        System.out.println("----------------");
        System.out.println("Result by Math class "+Math.hypot(side1,side2));
    }
    public static double hypoCalc (double x, double y) {
        double result = Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5);
        return result;
    }
}
