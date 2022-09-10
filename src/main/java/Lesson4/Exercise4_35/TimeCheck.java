package Lesson4.Exercise4_35;

import java.util.Scanner;

public class TimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours ");
        int hours = input.nextInt();
        if (hours < 1 || hours > 24) {
            System.out.println("The value is not valid");
        }
    }
}
