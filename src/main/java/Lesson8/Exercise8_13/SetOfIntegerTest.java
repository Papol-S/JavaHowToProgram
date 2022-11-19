package Lesson8.Exercise8_13;

public class SetOfIntegerTest {
    public static void main(String[] args) {
        SetOfInteger set1  = new SetOfInteger();
        SetOfInteger set2 = new SetOfInteger();
        set1.randomValue();
        set2.randomValue();
        System.out.println(set1);
        System.out.println(set2);
        System.out.println();

        SetOfInteger set3 = SetOfInteger.intersect(set1,set2);

        SetOfInteger.intersect(set1,set2).displayArray();
        System.out.println("test toString");
        System.out.println(SetOfInteger.intersect(set1,set2));


    }
}
