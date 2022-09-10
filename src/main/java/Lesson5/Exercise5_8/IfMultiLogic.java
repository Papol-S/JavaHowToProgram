package Lesson5.Exercise5_8;

import java.util.Scanner;

public class IfMultiLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value -> ");
        int x = input.nextInt();
        if (x<=20&&x>=10) {
            System.out.println("X is valid");
        }
        else {
            System.out.println("X is invalid");
        }
    }
}
