package Lesson7.Exercise7_11;

import java.util.Arrays;

public class oneDimensionalArray {
    public static void main(String[] args) {
        int [] arrayDemo1 = new int[10];
        Arrays.fill(arrayDemo1,0);
        displayArray(arrayDemo1);
        for (int i = 0; i < arrayDemo1.length; i++) {
            arrayDemo1[i] += 1;
        }
        displayArray(arrayDemo1);
        int [] arrayDemo2 = new int[10];
        arrayDemo2 = arrayDemo1;
        System.out.println("show array demo2");
        displayArray(arrayDemo2);
    }

    public static void displayArray (int[] arrays) {
        for (int value: arrays) {
            System.out.printf("%d ",value);
        }
        System.out.println();
    }
}
