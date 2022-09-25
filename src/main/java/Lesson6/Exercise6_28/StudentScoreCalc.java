package Lesson6.Exercise6_28;

import java.util.Scanner;

public class StudentScoreCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you score -> ");
        qualityPoints(input.nextInt());
    }

    public static void qualityPoints (int x) {
        if (x >= 90) {
            System.out.println("Grade 4");
        }
        else if (x >= 80) {
            System.out.println("Grade 3");
        }
        else if (x >= 70) {
            System.out.println("Grade 2");
        }
        else if (x >= 60) {
            System.out.println("Grade 1");
        }
        else {
            System.out.println("Grade 0");
        }
    }
}
