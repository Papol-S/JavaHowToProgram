package Lesson4.Exercise4_24;

import java.util.Scanner;

public class DisplayStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ->  ");
        int number = input.nextInt();
        if (number <= 200){
            if (number >= 100){
                System.out.println("Number is "+number);
            }
            else {
                System.out.println("Number is out of range");
            }
        }
        else {
            System.out.println("Number is out of range");
        }
    }
}
