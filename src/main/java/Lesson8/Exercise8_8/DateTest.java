package Lesson8.Exercise8_8;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(01,31,2022);
        //System.out.println(date1.toString());
        System.out.println("---Test increase day into next month---");
        date1.incrementDay();
        System.out.println(date1.toString());
        System.out.println();

        Date date2 = new Date(12,31,2022);
        System.out.println("---Test increase day into next year---");
        date2.incrementDay();
        System.out.println(date2.toString());

    }
}
