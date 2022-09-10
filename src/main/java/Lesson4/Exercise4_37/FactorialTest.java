package Lesson4.Exercise4_37;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        int number = input.nextInt();
        System.out.print("Enter estimate time for e value -> ");
        int estimateTime = input.nextInt();
        Factorial factorial = new Factorial(number);
        System.out.println(factorial.factorialCalc(number));
        System.out.println(factorial.eMath(estimateTime));
        System.out.println(factorial.eSquare(estimateTime));
    }

}
