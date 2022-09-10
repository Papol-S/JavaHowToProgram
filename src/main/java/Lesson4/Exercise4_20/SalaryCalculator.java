package Lesson4.Exercise4_20;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name -> ");
        String name = input.nextLine();
        System.out.print("Enter your working hours -> ");
        long workingHours = input.nextLong();
        System.out.print("Enter your hour rate -> ");
        double hourRate = input.nextDouble();

        if (workingHours<=40){
            double salary = workingHours*hourRate;
            System.out.printf("Your weekly salary is %.2f\n",salary);
        }
        else {
            double salary = hourRate*40;
            double overTime = (workingHours-40)*hourRate*2;
            salary = salary+overTime;
            System.out.printf("Your weekly saalry is %.2f\n",salary);
        }
    }
}
