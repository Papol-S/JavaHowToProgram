package Lesson8.Exercise8_11;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber();
        ComplexNumber complexNumber2 = new ComplexNumber(2,4);

        System.out.println("Test add");
        System.out.println(ComplexNumber.addComplexNumber(complexNumber1,complexNumber2));

        ComplexNumber complexNumber3 = ComplexNumber.addComplexNumber(complexNumber1,complexNumber2);
        System.out.println(complexNumber3);

        ComplexNumber complexNumber4 = new ComplexNumber();
        System.out.println(ComplexNumber.subtractComplexNumber(complexNumber1,complexNumber2));
        System.out.println(complexNumber4);

        System.out.println();
        System.out.println(ComplexNumber.addComplexNumber(ComplexNumber.subtractComplexNumber(complexNumber1,complexNumber2),complexNumber3));

    }
}
