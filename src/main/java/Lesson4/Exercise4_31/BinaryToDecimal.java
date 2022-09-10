package Lesson4.Exercise4_31;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number -> ");
        int number = input.nextInt();
        int sum = 0;
        int count = 0;
        int powerControl = 0;
        int result = 1;
        int temp = number;

        while (number>0) {
            int mod = number%2;
                if (count != 0) {
                    while (powerControl < count) {
                        result = result * 2;
                        powerControl++;
                    }
                }
            sum += mod*result;
            number = number/10;
            count++;
        }
        System.out.printf("Binary %d to Decimal %d",temp,sum);

    }
}