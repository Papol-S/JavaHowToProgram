package Lesson4.Exercise4_32;

public class CheckerBoard {
    public static void main(String[] args) {
        int countInRow = 1;
        int countInRColumn = 1;
        while (countInRColumn <= 8) {
            int checker = countInRColumn%2;
            if (checker == 1) {
                while (countInRow <= 8) {

                    System.out.print("* ");
                    System.out.print(" ");
                    System.out.print(" ");
                    countInRow++;
                }
                System.out.println();
            }
            else {
                while (countInRow <= 8) {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print("* ");
                    countInRow++;
                }
                System.out.println();
            }
            countInRColumn++;
            countInRow = 1;
        }
    }
}
