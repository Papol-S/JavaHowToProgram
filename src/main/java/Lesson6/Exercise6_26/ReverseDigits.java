package Lesson6.Exercise6_26;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        reverseDigits(input.nextInt());
    }

    public static void reverseDigits (int number) {
        int reverse = 0;
        for ( int i = number ; i > 0; i/=10) {
            int remainder = i%10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reverse Number is "+reverse);
    }
}
