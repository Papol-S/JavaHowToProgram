package Lesson4.Exercise4_34;

import java.util.Scanner;

public class ConditonOperator {
    public static void main(String[] args) {
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number -> ");
        int a = input.nextInt();
        b = a<20 ? 10 : 20;
        System.out.println("b is "+b);
    }
}
