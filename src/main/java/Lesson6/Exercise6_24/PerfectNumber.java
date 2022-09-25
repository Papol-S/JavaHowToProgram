package Lesson6.Exercise6_24;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfect();
    }

    public static void isPerfect () {

        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0) {
                    sum += j;
                }

            }
            //sum = sum - i;
            if (i == sum) {
                System.out.println("this is perfect number "+i);
                System.out.println("sum is "+sum);
            }
            else {

            }
        }
    }
}
