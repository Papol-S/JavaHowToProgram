package Lesson5.Exercise5_22;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int product = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        while (product < 50) {
            int x = input.nextInt();
            product = x*5;
            System.out.println("Product is -> "+product);
            System.out.print("Enter value -> ");
        }

    }
}
