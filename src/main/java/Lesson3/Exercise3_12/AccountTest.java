package Lesson3.Exercise3_12;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account(200.126);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        double amount = 500;
        account1.credit(amount);
        System.out.printf("Deposite to account1: $%.2f\n",amount);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());

        System.out.print("Enter Debit amount :");
        double debitAmount = input.nextDouble();

        account1.debit(debitAmount);
        System.out.printf("account balance: $%.2f\n",account1.getBalance());
    }
}
