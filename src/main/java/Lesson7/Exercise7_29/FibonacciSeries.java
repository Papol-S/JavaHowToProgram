package Lesson7.Exercise7_29;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
//    private int position = 0;
//    private int [] fibonacci = new int[position];
//
//    private final int position1 = 0;
//    private final int position2 = 1;
//
//    public void setPosition(int position) {
//        this.position = position;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//    public int fibonacci (int n) {
//
//        return n;
//    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter nth number to calculate fibonacci to: ");
    System.out.println(fibonacci(sc.nextInt()));
}
    // fibonacci
    public static double fibonacci(double n){
        // base case (not possible to positively reduce)
        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
