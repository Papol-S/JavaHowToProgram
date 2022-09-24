package Lesson6.Exercise6_22;

import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int select = input.nextInt();
        System.out.print("Enter value -> ");
        double temp = input.nextDouble();

        switch (select) {
            case 1 :
                System.out.printf("Convert from %.2f 'c -> %.2f 'f",temp,fahrenheit(temp));
                break;
            case 2 :
                System.out.printf("Convert from %.2f 'f -> %.2f 'c",temp,celsius(temp));
                break;
        }
    }

    public static double celsius (double fahrenheit) {
        double celsius = 5.0/9.0*(fahrenheit - 32);
        return celsius;
    }

    public static double fahrenheit (double celsius) {
        double fahrenheit = 9.0/5.0*celsius+32;
        return fahrenheit;
    }

}
