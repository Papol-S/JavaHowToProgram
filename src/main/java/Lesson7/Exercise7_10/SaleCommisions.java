package Lesson7.Exercise7_10;

import java.util.Scanner;

public class SaleCommisions {
    private static int[] frequency = new int[9];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 0;
        while (check!=-1) {
            System.out.print("Enter your gross sale (-1 for terminated program) -> ");
            check = input.nextInt();
            int salary = calcSalary(check);
            if (salary < 200) {
                continue;
            }
            else if (salary >= 1000) {
                ++frequency[8];
            }
            else {
                ++frequency[calcSalary(check)/100-2];
            }
        }
        displayTable();
        System.out.println(frequency);
    }

    public static int calcSalary (int grossSale) {
        int salary = 200 + (grossSale*9/100);
        return salary;
    }

    public static void displayTable () {
        for (int i = 1; i < 10; i++) {
            if (i == 9) {
                System.out.printf("$%d and over ",i*100+100);
                System.out.println(frequency[i-1]);
            }
            else {
                System.out.printf("$%d-%d ", i * 100 + 100, (i * 100) + 199);
                System.out.println(frequency[i - 1]);
            }
        }
    }
}
