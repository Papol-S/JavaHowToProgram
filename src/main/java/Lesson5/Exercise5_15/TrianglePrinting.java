package Lesson5.Exercise5_15;

public class TrianglePrinting {
    public static void main(String[] args) {
        triangleD();
    }

    public static void triangleA () {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i ; j++) {
                if (j<i) {
                    System.out.print("* ");
                }
                else if (j == i) {
                    System.out.printf("*\n");
                }
            }

        }
    }

    public static void triangleB () {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (i<j) {
                    System.out.print("* ");
                }
                else if (j == i) {
                    System.out.printf("*\n");
                }
            }
        }
    }

    public static void triangleC () {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 0; j--) {
                if (i<j) {
                    System.out.printf("%s","*");
                }
                else if (j == i) {
                    System.out.printf("%s\n","*");
                }
            }
        }
    }

    public static void triangleD () {
        for (int i = 1; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i>j) {
                    System.out.printf("%s","*");
                }
                else if (j == i) {
                    System.out.printf("%s\n","*");
                }
            }
        }
    }
}
