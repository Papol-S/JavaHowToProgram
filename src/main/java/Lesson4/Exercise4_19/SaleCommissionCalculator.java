/*
Initialize String firstName , lastName

Create constructor

Create getter setter

Create Method totolCommission
    declare variable double sum = 0
    declare variable double commission
    Initialize int itemNo
    Initialize double value
    prompt program to input itemNo
    Input itemNo
    prompt program to input value
    Input value

    While loop with sentinel value (value != -1)
        calculate commission of each item in loop
        sum commission in each loop
        prompt program to input itemNo
        Input itemNo
        prompt program to input value
        Input value
    Return total commission (sum)

Create Method display Sale earning
    declare double weeklyReceives = 200
    declare double totalSaleEarning = 0
    Calculate totolSaleEarning
    Printf sale name & totalSaleEarning
*/
package Lesson4.Exercise4_19;

import java.util.Scanner;

public class SaleCommissionCalculator {
    private String firstName , lastName;
    Scanner input = new Scanner(System.in);

    public SaleCommissionCalculator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double totalCommission (){
        int itemNo;
        double value;
        double commission;
        double sum = 0;

        System.out.print("Enter your item number -> ");
        itemNo = input.nextInt();
        System.out.print("Enter your item value -> ");
        value = input.nextDouble();

        while (itemNo!=-1) {
            commission = value*0.09;
            sum += commission;
            System.out.print("Enter your item number -> ");
            itemNo = input.nextInt();
            System.out.print("Enter your item value -> ");
            value = input.nextDouble();
        }
        return sum;
    }

    public void displaySaleEarning (){
        int weeklyReceive = 200;
        double totalSaleEarning = weeklyReceive+totalCommission();
        System.out.printf("%s %s weekly earning is $%.2f\n",getFirstName(),getLastName(),totalSaleEarning);
    }



}
