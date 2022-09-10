package Lesson4.Exercise4_19;

import java.util.Scanner;

public class SaleCommissionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name -> ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name -> ");
        String lastName = input.nextLine();

        SaleCommissionCalculator c1 = new SaleCommissionCalculator(firstName,lastName);
//        c1.totalCommission();
        c1.displaySaleEarning();
    }
}
