package Lesson4.Exercise4_6;

public class Exercise4_6 {
    public static void main(String[] args) {
        int total = 0;
        int counter = 1;

        while (counter<=20) {
            total += counter++;
        }
        System.out.printf("sum from 1 to 20 is %d\n",total);
    }
}
