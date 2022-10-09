package Lesson7.Exercise7_20;

import java.util.Scanner;

public class TotalSales {
    private static int[][] revernueMonthly = new int[7][6];
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        assignValue();
        display();
        sumBySale();
        sumByProduct();
        display();
    }
    public static void sumByProduct () {

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 1; j <= 4; j++) {
                sum = sum + revernueMonthly[i][j];
            }
            revernueMonthly[i][5] = sum;
        }
    }

    public static void sumBySale() {

        for (int j = 1; j <= 4; j++) {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum = sum + revernueMonthly[i][j];
            }
            revernueMonthly[6][j] = sum;
        }
    }
    public static void assignValue () {
        for (int j = 1; j <= 4; j++) {
            System.out.printf("Sale person %d\n",j);
            for (int i = 1; i <= 5 ; i++) {
                System.out.printf("Enter sale slip of product %d : ",i);
                revernueMonthly[i][j] = input.nextInt();
            }
        }
    }

    public static void display () {
        System.out.println("Overall sale monthly");
        System.out.printf("%14s%7s%7s%7s%7s%16s\n","","Sale1","Sale2","Sale3","Sale4","Sum by Product");
        for (int i = 1; i < 7; i++) {
            if (i == 6) {
                System.out.printf("%-14s","Sum by Sale");
                for (int j = 1; j < 6; j++) {
                    System.out.printf("%-7d", revernueMonthly[i][j]);
                }
            }
            else {
                System.out.printf("Product%d", i);
                for (int j = 1; j < 6; j++) {
                    System.out.printf("%7d", revernueMonthly[i][j]);
                }
                System.out.println();
            }
        }
    }

}
