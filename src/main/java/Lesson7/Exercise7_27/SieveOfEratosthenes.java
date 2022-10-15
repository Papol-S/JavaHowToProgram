package Lesson7.Exercise7_27;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private static boolean[] primeNumber = new boolean[1000];
    public static void main(String[] args) {
        Arrays.fill(primeNumber,true);
        for (int i = 2; i < primeNumber.length; i++) {
            if (primeNumber[i]) {
                for (int j = i + 1; j < primeNumber.length; j++) {
                    if (j%i == 0) {
                        primeNumber[j] = false;
                    }
                }
            }
        }
        display();
    }

    public static void display() {
        for (int i = 2; i < primeNumber.length; i++) {
            if (primeNumber[i]) {
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
    }
}
