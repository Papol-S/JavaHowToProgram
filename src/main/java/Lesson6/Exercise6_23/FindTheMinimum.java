package Lesson6.Exercise6_23;

import java.util.Scanner;

public class FindTheMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 values -> ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();
        System.out.println("Minimum number is "+minimum3(number1,number2,number3));
    }

    public static float minimum3 (float x ,float y , float z){
         float minimum = Math.min(x,Math.min(y,z));
         return minimum;
    }
}
