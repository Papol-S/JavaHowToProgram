package Lesson6.Exercise6_13;

import java.util.Random;

public class RandomScalingAndShift {
    public static void main(String[] args) {
        random1();
        random2();
        random3();
    }

    public static void random1 () {
        Random randomNumbers = new Random();
        int randomResult = 2 + 2 * randomNumbers.nextInt(5);
        System.out.printf("Random number 2,4,6,8,10 is %d\n",randomResult);
    }
    public static void random2 () {
        Random randomNumbers = new Random();
        int randomResult = 3 + 2 * randomNumbers.nextInt(5);
        System.out.printf("Random number 3,5,7,9,11 is %d\n",randomResult);
    }
    public static void random3 () {
        Random randomNumbers = new Random();
        int randomResult = 6 + 4 * randomNumbers.nextInt(5);
        System.out.printf("Random number 6,10,14,18,22 is %d\n",randomResult);
    }
}
