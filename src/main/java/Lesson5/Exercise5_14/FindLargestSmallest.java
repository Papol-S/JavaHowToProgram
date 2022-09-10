package Lesson5.Exercise5_14;

import java.util.Scanner;

public class FindLargestSmallest {
    private static int largest;
    private static int smallest;
    public static void main(String[] args) {
            findLargestSmallest();
    }


    public static void findLargestSmallest () {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value -> ");
        int x = input.nextInt();
        largest = x;
        smallest = x;
        while (x!=-1) {
            if (x == -1) {
                break;
            }
            else if (x > largest) {
                largest = x;
            }
            else if (x < smallest) {
                smallest = x;
            }
            System.out.print("Enter value -> ");
            x = input.nextInt();
        }

        System.out.println("Largest is "+largest);
        System.out.println("Smallest is "+smallest);
    }
}
