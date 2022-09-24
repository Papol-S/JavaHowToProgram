package Lesson6.Exercise6_20;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius -> ");
        double radius = input.nextDouble();
        System.out.printf("Area of circle with radius %.2f is %.2f\n",radius,circleArea(radius));
    }
    public static double circleArea (double radius) {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
