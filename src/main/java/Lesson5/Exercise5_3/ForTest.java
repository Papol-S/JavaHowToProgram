package Lesson5.Exercise5_3;

public class ForTest {
    public static void main(String[] args) {
        System.out.println(sumTest());
        System.out.println(powerTest());
        System.out.println();
        whilePrint();
        forPrint();
        }

    public static int sumTest () {
        int sum = 0;
        for (int i = 0; i <=50 ; i+=2) {
            sum += i;
        }
        return sum;
    }
    public static double powerTest (){
        double power = 0;
        power = Math.pow(3.5,2);
        return power;
    }
    public static void whilePrint () {
        int x = 1;
        while (x<=100) {
            if (x%10!=0) {
                System.out.printf("%d ",x);
                x++;
            }
            else {
                System.out.printf("%d ",x);
                System.out.println();
                x++;
            }
        }
    }
    public static void forPrint () {
        int x = 1;
        for (; x <= 100; x++) {
            if (x%10!=0) {
                System.out.printf("%d ",x);
            }
            else {
                System.out.printf("%d ",x);
                System.out.println();
            }
        }
    }
}
