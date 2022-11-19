package Lesson8.Exercise8_16;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class HugeInteger {
    private static int sizeArray = 40;
    private int[] hugeInteger = new int[sizeArray];

    private int length;

    public HugeInteger (String i) {
        parse(i);
    }
    public void parse (String a) {
        length = a.length();
        int c = length ;
        for (int i = sizeArray-1; i >= sizeArray-length; i--) {
            hugeInteger[i] = Integer.parseInt(String.valueOf(a.charAt(--c)));
        }
    }

    public int[] getHugeInteger () {
        return hugeInteger;
    }

    public int getLength () {
        return length;
    }

    public static HugeInteger add (HugeInteger a, HugeInteger b) {
        int[] temp1 = a.getHugeInteger();
        int[] temp2 = b.getHugeInteger();
        int[] result = new int[sizeArray];

        int checker = 0;
        int length = (a.getLength() < b.getLength()) ? b.getLength() : a.getLength();
        int resultLength = length;
        for (int i = sizeArray - 1; i >= sizeArray - length; i--) {
            result[i] = (temp1[i] + temp2[i] + checker) % 10;
            if (i == sizeArray-length && (temp1[i] + temp2[i] + checker) > 9) {
                resultLength = length++;
                result[i-1] = 1;
                break;
            }
            if (temp1[i] + temp2[i] + checker > 9)
                checker = 1;
            else
                checker = 0;
        }
        return new HugeInteger(arrayToString(result,resultLength));
    }

    public static HugeInteger subtract (HugeInteger a, HugeInteger b) {
        int[] temp1 = a.getHugeInteger();
        int[] temp2 = b.getHugeInteger();
        int[] result = new int[sizeArray];

        int checker = 0;
        int length = (a.getLength() < b.getLength()) ? b.getLength() : a.getLength();
        int resultLength = length;
        for (int i = sizeArray - 1; i >= sizeArray - length; i--) {
            if (result[i-1]-checker >= 1) {

                result[i] = Math.abs((temp1[i] - temp2[i] + 10 - checker) % 10);
                if (i == sizeArray - length ) {
                    if (temp1[i] - checker < temp2[i]) {
                        result[i] *= -1;
                    } else if (temp1[i] == temp2[i]) {
                        resultLength = length--;
                    }
                    break;
                }
                if (temp1[i] - checker < temp2[i])
                    checker = 1;
                else
                    checker = 0;
            }
        }
        return new HugeInteger(arrayToString(result,resultLength));
    }
    public static String arrayToString (int[] a,int length) {
        String convertString = "";
        for (int i = sizeArray-1-length; i < sizeArray; i++) {
            convertString += a[i];
        }
        return convertString;
    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "hugeInteger=" + Arrays.toString(hugeInteger) +
                '}';
    }
}
