package Lesson5.Exercise5_21;

import java.util.Scanner;

public class PythagoreanTriples {
    private int side1;
    private int side2;
    private double hypotenuse;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    private double hypotenuseCalc (int x , int y) {
        double hypotenuse = 0;
        hypotenuse =  Math.pow(Math.pow(x,2)+Math.pow(y,2),0.5);
        return hypotenuse;
    }

    public void display () {
        System.out.printf("%10s%10s = %10s\n","x","y","result");
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500 ; j++) {
                if (hypotenuseCalc(i,j) <= 500 ) {
                    System.out.printf("%10d%10d = %10d\n",i,j,(int) hypotenuseCalc(i,j));
                }
                else {
                    continue;
                }

            }
        }
    }
}
