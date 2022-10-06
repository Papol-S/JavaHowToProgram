package Lesson7.Exercise7_8;
import java.util.Arrays;

public class MyFirstArray {
    private static int[] arrayTest1 =  {0,1,2,3,4,5,6};

    private static  int[] arrayTest2 = new int[5];

    private static  float[] arrayTest3 = new float[100];
    public static void main(String[] args) {
        displayArrayElement();
        displayArray();
        displayTotal();
        copyArray();
        smallestArray();
        bigestArray();
    }
    public static void displayArrayElement () {
        System.out.println(arrayTest1[6]);
    }

    public static void displayArray () {
        Arrays.fill(arrayTest2,8);
        for (int value: arrayTest2) {
            System.out.printf("%d ", value);
        }
        System.out.println();

    }

    public static void displayTotal () {
        for (int i = 0; i < arrayTest3.length; i++) {
            arrayTest3[i] = i+1.137f;
        }
        for (float value: arrayTest3) {
            System.out.printf("%.2f ",value);
        }
        System.out.println();
        float total = 0;
        for (int i = 0; i < arrayTest3.length; i++) {
            total += arrayTest3[i];
            System.out.printf("%.2f ",total);
        }
        System.out.println();
    }

    public static void copyArray () {
        int[] array1 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[34];
        for (int value:array1) {
            System.out.printf("%d ",value);
        }
        System.out.println("\nAfter copy");
        System.arraycopy(array1,0,array2,1,array1.length);

        for (int value:array2) {
            System.out.printf("%d ",value);
        }
        System.out.println();
    }

    public static void smallestArray () {
        float smallest = arrayTest3[0];
        for (int i = 0; i < arrayTest3.length; i++) {
            if (arrayTest3[i] < smallest) {
                smallest = arrayTest3[i];
            }
        }
        System.out.printf("The smallest value is %.2f\n",smallest);
    }

    public static void bigestArray () {
        float biggest = arrayTest3[0];
        for (int i = 0; i < arrayTest3.length; i++) {
            if (arrayTest3[i]>biggest) {
                biggest = arrayTest3[i];
            }
        }
        System.out.printf("The biggest value is %.2f\n",biggest);
    }
}

