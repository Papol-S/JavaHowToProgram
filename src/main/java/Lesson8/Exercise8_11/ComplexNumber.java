package Lesson8.Exercise8_11;

public class ComplexNumber {
    private double reaPart;
    private double imaginaryPart;

    public ComplexNumber(double reaPart, double imaginaryPart) {
        setReaPart(reaPart);
        setImaginaryPart(imaginaryPart);
    }

    public ComplexNumber() {
        setReaPart(1);
        setImaginaryPart(1);
    }

    public double getReaPart() {
        return reaPart;
    }

    public void setReaPart(double reaPart) {
        this.reaPart = reaPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return String.format("%.2f,%.2f",reaPart,imaginaryPart);
    }

    public static ComplexNumber addComplexNumber (ComplexNumber complex1,ComplexNumber complex2) {
        return new ComplexNumber((complex1.getReaPart()+complex2.getReaPart()),(complex1.getImaginaryPart()+complex2.getImaginaryPart()));
    }

    public static ComplexNumber subtractComplexNumber (ComplexNumber complex1 , ComplexNumber complex2) {
        return new ComplexNumber(complex1.getReaPart()- complex2.getReaPart(),complex1.getImaginaryPart()-complex2.getImaginaryPart());
    }

}
