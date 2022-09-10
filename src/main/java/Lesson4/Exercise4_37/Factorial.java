package Lesson4.Exercise4_37;

import javax.swing.plaf.IconUIResource;

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double factorialCalc (int number) {
        int result = 1;
        int count = 0;
        while (count < number) {
            result = result * (number-count);
            count++;
        }
        return result;
    }

    public double eMath (int estimateTime){
        double result = 0;
        int count = 1;
        while (count < estimateTime) {
            double test = 1/factorialCalc(count);
            result = result+ (test);
            count++;
        }
        result = result + 1;
        return result;
    }

    public double exponential (double exponential, int times) {
        double result = 1;
        int count = 0;
        while (count < times) {
            result *= exponential;
            count++;
        }
        return result;
    }

    public double eSquare (int exponentiaE) {
        double result = 0;
        int count = 1;
        while (count <= exponentiaE) {
            result += exponential(exponentiaE,count)/factorialCalc(count);
            count++;
        }
        result += 1;
        return result;
    }
}
