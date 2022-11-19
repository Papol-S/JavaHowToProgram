package Lesson8.Exercise8_14;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11,7,2022);
        System.out.println(date);
        System.out.println(date.toString2());
        System.out.println(date.toString3());

        try {
            Date date2 = new Date("Feb", 29, 2022);
            System.out.println(date2);
            System.out.println(date2.toString2());
            System.out.println(date2.toString3());
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }

        try {
            Date date3 = new Date(365, 2022);
            System.out.println(date3);
            System.out.println(date3.toString2());
            System.out.println(date3.toString3());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
