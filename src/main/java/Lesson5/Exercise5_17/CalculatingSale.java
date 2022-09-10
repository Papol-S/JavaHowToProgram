package Lesson5.Exercise5_17;

import java.util.Scanner;

public class CalculatingSale {
    private double sum;
    private int itemNumber;
    private int quantity;
    private double total1;
    private double total2;
    private double total3;
    private double total4;
    private double total5;

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void calculate () {

        switch (getItemNumber()) {
            case 1:
                sum = 2.98 * quantity;
                total1 += sum;
                break;
            case 2:
                sum = 4.50 * quantity;
                total2 += sum;
                break;
            case 3:
                sum = 9.98 * quantity;
                total3 += sum;
                break;
            case 4:
                sum = 4.49 * quantity;
                total4 += sum;
                break;
            case 5:
                sum = 6.87 * quantity;
                total5 += sum;
                break;
            default:
                System.out.println("invalid item number");
        }
    }

    public void  inputValue () {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item number -> ");

        while (input.hasNext()) {
            setItemNumber(input.nextInt());
            System.out.print("Enter quantity -> ");
            setQuantity(input.nextInt());
            calculate();
            System.out.print("Enter item number -> ");
        }
        System.out.printf("Total sale of product1 %.2f\n",total1);
        System.out.printf("Total sale of product2 %.2f\n",total2);
        System.out.printf("Total sale of product3 %.2f\n",total3);
        System.out.printf("Total sale of product4 %.2f\n",total4);
        System.out.printf("Total sale of product5 %.2f\n",total5);

    }

}
