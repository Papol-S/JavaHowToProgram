package Lesson6.Exercise6_14;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exponentiation expo = new Exponentiation();
        System.out.print("Enter base -> ");
        int baseNumber = input.nextInt();
        System.out.print( "Enter exponent -> ");
        int exponentNumber = input.nextInt();

        System.out.printf("Result of %d power %d is %d\n",baseNumber,exponentNumber,expo.exponentiationCalc(baseNumber,exponentNumber));
    }

    public int exponentiationCalc (int base , int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent ; i++) {
            result *= base;
        }
        return result;
    }
}
