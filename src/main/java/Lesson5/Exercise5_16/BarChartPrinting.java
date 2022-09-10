package Lesson5.Exercise5_16;

public class BarChartPrinting {
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;

    public BarChartPrinting(int number1, int number2, int number3, int number4, int number5) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getNumber4() {
        return number4;
    }

    public void setNumber4(int number4) {
        this.number4 = number4;
    }

    public int getNumber5() {
        return number5;
    }

    public void setNumber5(int number5) {
        this.number5 = number5;
    }

    public void displayAsterisks () {
        for (int i = 1; i <= number1; i++) {
            if (i<number1) {
                System.out.print("*");
            }
            else if (i == number1) {
                System.out.printf("*\n");
            }
        }

        for (int i = 1; i <= number2; i++) {
            if (i<number2) {
                System.out.print("*");
            }
            else if (i == number2) {
                System.out.printf("*\n");
            }
        }

        for (int i = 1; i <= number3; i++) {
            if (i<number3) {
                System.out.print("*");
            }
            else if (i == number3) {
                System.out.printf("*\n");
            }
        }

        for (int i = 1; i <= number4; i++) {
            if (i<number4) {
                System.out.print("*");
            }
            else if (i == number4) {
                System.out.printf("*\n");
            }
        }

        for (int i = 1; i <= number5; i++) {
            if (i<number5) {
                System.out.print("*");
            }
            else if (i == number5) {
                System.out.printf("*\n");
            }
        }
    }
    public static boolean checker (int number) {
        boolean result ;
        if (number >= 1 && number <= 30) {
            result = true;
        }
        else
            result = false;
        return result;
    }
}
