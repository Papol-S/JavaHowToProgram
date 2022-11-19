package Lesson8.Exercise8_15;

import Lesson7.Exercise7_21.FloorSize;

public class RationalNumber {
    private int numerator;
    private int denominator;


    public RationalNumber (int n, int d) {
        reduceForm(n,d);
    }
    public RationalNumber () {
        numerator = 1;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator (int n) {
        numerator = n;
    }
    public void setDenominator (int d) {
        denominator = d;
    }
    public boolean isUnrealNumber (int n, int d) {
        if (d == 0 && n == 0)
            return false;
        else if (d == 0) {
            return true;
        }
        else
            return false;
    }

    public void reduceForm (int n, int d) {
        if (isUnrealNumber(n,d)) {
            throw new IllegalArgumentException("Invalid number");
        }
        else {
            int min = Math.min(Math.abs(n), Math.abs(d));
            int divider = 2;
            while (divider <= min) {
                if (n % divider == 0 && d % divider == 0) {
                    n /= divider;
                    d /= divider;
                } else
                    divider++;
            }
            numerator = n;
            denominator = d;
        }
    }



    public static RationalNumber add (RationalNumber a, RationalNumber b) {
        int numeratorA = a.getNumerator()*b.getDenominator();
        int numeratorB = b.getNumerator()*a.getDenominator();
        return new RationalNumber((numeratorA+numeratorB),a.getDenominator()*b.getDenominator());
    }

    public static RationalNumber subtract (RationalNumber a, RationalNumber b) {
        int numeratorA = a.getNumerator()*b.getDenominator();
        int numeratorB = b.getNumerator()*a.getDenominator();
        return new RationalNumber((numeratorA-numeratorB),a.getDenominator()*b.getDenominator());
    }

    public static RationalNumber multiple (RationalNumber a, RationalNumber b) {
        return new RationalNumber(a.getNumerator()*b.getNumerator(),a.getDenominator()*b.getDenominator());
    }

    public static RationalNumber divide (RationalNumber a, RationalNumber b) {
        return new RationalNumber(a.getNumerator()*b.getDenominator(),a.getDenominator()*b.getNumerator());
    }




    @Override
    public String toString() {
        return String.format("%d/%d",getNumerator(),getDenominator());
    }
    public String  displayDecimal (int decimal) {
        return String.format("%.%df",decimal,getNumerator()/getDenominator());
    }
}
