package Lesson5.Exercise5_26;

public class BreakTest {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <=10 ; count++) {
            System.out.printf("%d ",count);
            if (count ==4) {
                count = 11;
            }
        }
        System.out.printf("\nBroke out of the loop at count %d\n",5);
    }
}
