package Lesson7.Exercise7_16;

public class CopyOneArrayFromAnother {
    public static void main(String[] args) {
        int [] arrayDemo1 = {1,2,3,4,5,6,7,8,9,10};
        displayArray(arrayDemo1);
        int [] arrayDemo2 = new int[10];
        System.out.println("\nBefore copy");
        displayArray(arrayDemo2);
        System.arraycopy(arrayDemo1,0,arrayDemo2,0,arrayDemo1.length);
        System.out.println("\nAfter copy ");
        displayArray(arrayDemo2);

    }
    public static void displayArray (int [] array) {
        for (int value :array) {
            System.out.printf("%d ",value);
        }
    }
}
