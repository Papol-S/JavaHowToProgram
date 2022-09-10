package Lesson5.Exercise5_16;

import java.util.Scanner;

public class BarChartPrintingTest {
    private static int number1;
    private static int number2;
    private static int number3;
    private static int number4;
    private static int number5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value -> ");
            int number = input.nextInt();
            if (BarChartPrinting.checker(number)) {
                switch (i) {
                    case 0:
                        number1 = number;
                        break;
                    case 1:
                        number2 = number;
                        break;
                    case 2:
                        number3 = number;
                        break;
                    case 3:
                        number4 = number;
                        break;
                    case 4:
                        number5 = number;
                        break;
                }
            }
            else {
                System.out.println("Invalid value, Number must be between 10 to 30");
                i--;
            }
        }
        BarChartPrinting test = new BarChartPrinting(number1,number2,number3,number4,number5);
        test.displayAsterisks();

    }
}
