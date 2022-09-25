package Lesson6.Exercise6_25;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime();
    }
    
    public static void isPrime () {
        int countPrime = 0;
        for (int i = 1; i < 10000; i++) {
            int count = 0;
            for (int j = 1; j <= Math.pow(i,0.5); j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 1){
                System.out.println("This is prime number "+i);
                countPrime++;
            }
        }
        System.out.println("Total prime is "+countPrime);
    }
}
