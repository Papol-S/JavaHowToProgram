package Lesson4.Exercise4_33;

public class FirstTenMultiple {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        int count = 1;

        System.out.print("Multiple of integer 3 are");
        while (count <= 10) {
            number1 = number1*3;
            count++;
            System.out.print(" "+number1);
        }
        System.out.println();
        count = 1;
        System.out.print("Multiple of integer 4 are ");
        while (count <= 10) {
            number2 = number2*4;
            count++;
            System.out.print(" "+number2);
        }
        System.out.println();
    }
}
