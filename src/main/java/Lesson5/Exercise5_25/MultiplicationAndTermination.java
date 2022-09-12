package Lesson5.Exercise5_25;

import java.util.Scanner;

public class MultiplicationAndTermination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value1 > ");
        do {
            int number1 = input.nextInt();
            System.out.print("Enter value2 > ");
            int number2 = input.nextInt();
            int product = number1*number2;
            System.out.println("Result is "+product);
            System.out.println("Enter value1 > ");
        }
        while (input.hasNext());
    }
}
