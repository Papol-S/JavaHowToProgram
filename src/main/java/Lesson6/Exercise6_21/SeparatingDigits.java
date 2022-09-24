package Lesson6.Exercise6_21;

public class SeparatingDigits {
    public static void main(String[] args) {
        separatingDigits(100);
    }

    public static int integerPart (int a , int b) {
        int integerPart = a/b;
        return  integerPart;
    }

    public static int remainderPart (int a , int b){
        int remainder = a%b;
        return remainder;
    }

    public static void separatingDigits (int x) {
        int count = 0;
        int check = 1;
        int i = 10;
        while (check != 0){
            check = integerPart(x,i);
            count++;
            i *= 10;
        }
        System.out.println("count is "+count);



    }
}
