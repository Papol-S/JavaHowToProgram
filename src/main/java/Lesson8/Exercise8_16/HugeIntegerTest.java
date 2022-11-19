package Lesson8.Exercise8_16;

public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger("12345");
        System.out.println(hugeInteger);
        HugeInteger hugeInteger2 = new HugeInteger("999999");
        System.out.println(hugeInteger2);
        System.out.println(HugeInteger.add(hugeInteger,hugeInteger2));
        System.out.println(HugeInteger.subtract(hugeInteger,hugeInteger2));



    }
}
