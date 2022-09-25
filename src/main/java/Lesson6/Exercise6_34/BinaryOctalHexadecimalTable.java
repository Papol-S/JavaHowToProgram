package Lesson6.Exercise6_34;

import java.util.Scanner;
import java.util.Stack;

public class BinaryOctalHexadecimalTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number -> ");
        int x = input.nextInt();
        System.out.printf("%20s%20s%20s%20s\n","Decimal","Binary","Octal","Hexadecimal");
        System.out.print(x);
        binaryConvertor(x);
    }

    public static void binaryConvertor (int number) {
        Stack<Integer> stack = new Stack();
        int remainder = 0;
        while (number != 0) {
            stack.push(number%2);
            number = number/2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }

    public static void octalConvertor (int number) {
        Stack<Integer> stack = new Stack();
        int remainder = 0;
        while (number != 0) {
            stack.push(number%8);
            number = number/8;
        }
        while (!(stack.isEmpty())) {
            stack.pop();
        }
    }
}

