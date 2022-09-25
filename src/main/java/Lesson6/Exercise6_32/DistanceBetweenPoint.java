package Lesson6.Exercise6_32;

import java.util.Scanner;

public class DistanceBetweenPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinate point 1 ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter coordinate point 2 ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Distance is "+new DistanceBetweenPoint().distanceCalc(x1,y1,x2,y2));
    }

    public double distanceCalc (double x1, double y1, double x2, double y2) {
        double distance = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        return distance;
    }
}
