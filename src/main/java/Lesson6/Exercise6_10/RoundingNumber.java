package Lesson6.Exercise6_10;

import java.util.Scanner;

public class RoundingNumber {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
            checker();
    }

    public static int roundToInteger (double x) {
        int y = (int) Math.floor(x + 0.5);
        return y;
    }

    public static double roundToTenth (double x) {
        double y =  Math.floor(x * 10  + 0.5)/10;
        return y;
    }

    public static double roundToHundredth (double x) {
        double y =  Math.floor(x * 100 + 0.5)/100;
        return y;
    }

    public static double roundToThousandth (double x) {
        double y =  Math.floor(x * 1000 + 0.5)/1000;
        return y;
    }

    public static void checker () {
        System.out.println("Select your rounding type");
        System.out.println("1. Round to Integer");
        System.out.println("2. Round to Tenth");
        System.out.println("3. Round to Hundredth");
        System.out.println("4. Round to Thousandth");

        int i = input.nextInt();

        System.out.print("Enter your value");
        double j = input.nextDouble();
        switch (i) {
            case 1 :
                System.out.printf("Value before rounding = %.2f\n",j);
                System.out.printf("Value after rounding = %d\n",roundToInteger(j));
                break;
            case 2 :
                System.out.printf("Value before rounding = %.2f\n",j);
                System.out.printf("Value after rounding = %.2f\n",roundToTenth(j));
                break;
            case 3 :
                System.out.printf("Value before rounding = %.3f\n",j);
                System.out.printf("Value after rounding = %.3f\n",roundToHundredth(j));
                break;
            case 4 :
                System.out.printf("Value before rounding = %.4f\n",j);
                System.out.printf("Value after rounding = %.4f\n",roundToThousandth(j));
                break;
            default :
                System.out.println("Invalid input");
        }
    }

}
