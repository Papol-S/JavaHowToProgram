package Lesson4.Exercise4_30;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five digit number -> ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        if (number < 99999 && number > 10000) {
            while (number>0) {
                int mod = number%10;
                sum = (sum*10) + mod;
                number = number / 10;

            }
            if (temp == sum) {
                System.out.println("This number is palindrome");
            }
            else {
                System.out.println("This number isn't palindrome");
            }
        }
        else {
            System.out.println("The number is not five digits");
        }
    }
}
