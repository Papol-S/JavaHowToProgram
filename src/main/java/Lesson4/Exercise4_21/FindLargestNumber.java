package Lesson4.Exercise4_21;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 1;
        int largest=0;

        while (count <= 5) {
            System.out.print("Enter your number -> ");
            number = input.nextInt();
            if (largest<=number) {
                largest = number;
            }
            count++;
        }
        System.out.printf("The largest number is %d\n",largest);

    }
}
