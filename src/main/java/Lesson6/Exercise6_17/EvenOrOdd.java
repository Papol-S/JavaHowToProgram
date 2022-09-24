package Lesson6.Exercise6_17;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 -> ");
        int number1 = input.nextInt();
        System.out.println(isEven(number1));
    }

    public static boolean isEven (int x) {
        boolean result = false;
        if (x%2 == 0) {
            result = true;
        }
        return result;
    }
}
