package Lesson6.Exercise6_12;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        random1();
        random2();
        random3();
        random4();
        random5();
    }

    public static void random1 () {
        Random randomNumbers = new Random();
        int randomResult = 1 + randomNumbers.nextInt(2);
        System.out.printf("Random number 1<=n<=2 is %d\n",randomResult);
    }
    public static void random2 () {
        Random randomNumbers = new Random();
        int randomResult = 1 + randomNumbers.nextInt(100);
        System.out.printf("Random number 1<=n<=100 is %d\n",randomResult);
    }
    public static void random3 () {
        Random randomNumbers = new Random();
        int randomResult = randomNumbers.nextInt(10);
        System.out.printf("Random number 0<=n<=9 is %d\n",randomResult);
    }
    public static void random4 () {
        Random randomNumbers = new Random();
        int randomResult = 1000 + randomNumbers.nextInt(113);
        System.out.printf("Random number 1000<=n<=1112 is %d\n",randomResult);
    }
    public static void random5 () {
        Random randomNumbers = new Random();
        int randomResult = randomNumbers.nextInt(3) - 1;
        System.out.printf("Random number -1<=n<=1 is %d\n",randomResult);
    }
    public static void random6 () {
        Random randomNumbers = new Random();
        int randomResult = randomNumbers.nextInt(15) - 3;
        System.out.printf("Random number -3<=n<=11 is %d\n",randomResult);
    }
}
