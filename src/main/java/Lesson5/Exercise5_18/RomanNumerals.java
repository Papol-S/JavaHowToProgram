package Lesson5.Exercise5_18;

import java.util.Scanner;

public class RomanNumerals {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void select () {
        switch (getNumber()) {
            case 1 :
                System.out.println("I");
                break;
            case 2 :
                System.out.println("II");
                break;
            case 3 :
                System.out.println("III");
                break;
            case 4 :
                System.out.println("IV");
                break;
            case 5 :
                System.out.println("V");
                break;
            case 6 :
                System.out.println("VI");
                break;
            case 7 :
                System.out.println("VII");
                break;
            case 8 :
                System.out.println("VIII");
                break;
            case 9 :
                System.out.println("IX");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }

    public void inputData () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        while (input.hasNext()) {
            setNumber(input.nextInt());
            select();
            System.out.print("Enter value -> ");
        }

    }

}
