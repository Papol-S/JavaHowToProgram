package Lesson5.Exercise5_27;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                for (int k = 1; k <= 4 ; k++) {
                    System.out.print('@');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
