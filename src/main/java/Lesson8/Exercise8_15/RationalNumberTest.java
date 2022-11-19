package Lesson8.Exercise8_15;

public class RationalNumberTest {
    public static void main(String[] args) {
        RationalNumber rationalNumber = new RationalNumber(-152,10);
        System.out.println(rationalNumber);

        RationalNumber rationalNumber2 = new RationalNumber(152,10);
        System.out.println(rationalNumber2);

        RationalNumber rationalNumber3 = new RationalNumber(2,4);
        System.out.println(rationalNumber3);

        RationalNumber rationalNumber4 = new RationalNumber(3,6);
        System.out.println(rationalNumber4);

        System.out.println(RationalNumber.add(rationalNumber3,rationalNumber4));

        System.out.println("After add");

        System.out.println(rationalNumber3);
        System.out.println(rationalNumber4);

        try {
            RationalNumber rationalNumber5 = new RationalNumber(3,0);
            System.out.println(rationalNumber5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        try {
            RationalNumber rationalNumber6 = new RationalNumber(0,0);
            System.out.println(rationalNumber6);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }

        System.out.println("subtract");
        System.out.println(RationalNumber.subtract(rationalNumber3,rationalNumber4));

        System.out.println("multiple");
        System.out.println(RationalNumber.multiple(rationalNumber3,rationalNumber4));

        System.out.println("divide");
        System.out.println(RationalNumber.divide(rationalNumber3,rationalNumber4));

        RationalNumber rationalNumber1 = RationalNumber.divide(rationalNumber3,rationalNumber4);
        System.out.println(rationalNumber1.displayDecimal(2));


    }
}
