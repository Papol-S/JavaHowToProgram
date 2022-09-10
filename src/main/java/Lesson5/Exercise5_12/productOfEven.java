package Lesson5.Exercise5_12;

public class productOfEven {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i <= 10; i+=2) {
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
