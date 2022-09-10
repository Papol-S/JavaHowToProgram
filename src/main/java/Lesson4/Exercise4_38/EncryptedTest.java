package Lesson4.Exercise4_38;

import java.util.Scanner;

public class EncryptedTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Encrypted ID -> ");
        int number = input.nextInt();
        EncryptedValue encrypt1 = new EncryptedValue(number);
        System.out.printf("After encrypted is %04d\n",encrypt1.encript());
        DeencryptedValue deencryptq = new DeencryptedValue(encrypt1.encript());
        System.out.printf("After deencripted is %04d\n",deencryptq.deEncrypt());
    }
}
