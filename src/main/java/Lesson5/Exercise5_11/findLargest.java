package Lesson5.Exercise5_11;

import java.util.Scanner;

public class findLargest {
    private static int large;

    private static int compare(int largeInput) {
        if (largeInput > large) {
            large = largeInput;
        }
        return  large;
    }

    public static int Largest () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");

        int largest = 0;
        while (input.hasNext()) {
            int x = input.nextInt();
            System.out.print("Enter value -> ");
            largest = compare(x);
        }
        return largest;
    }
}
