package Lesson5.Exercise5_13;

public class Factorials {
    public static void main(String[] args) {
        factorialCalc();
    }

    public static void factorialCalc () {

        System.out.printf("%6s%20s\n","Number","Factorial result");
        for (int i = 1; i <= 20 ; i++) {
            long result = 1;
            for (int j = i; j > 0; j--) {
                result = result*j;
            }
            System.out.printf("%6s%20d\n",i,result);
        }
    }
}
