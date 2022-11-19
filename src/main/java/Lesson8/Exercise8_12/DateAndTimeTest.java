package Lesson8.Exercise8_12;

public class DateAndTimeTest {
    public static void main(String[] args) {
        Date date = new Date(11,03,2022);
        Time2 time2 = new Time2(23,59,59);
        DateAndTime dateAndTime = new DateAndTime(date,time2);
        System.out.println(dateAndTime);
        System.out.println();
        dateAndTime.incrementSecond();
        System.out.println(dateAndTime);

        System.out.println();
        System.out.println("test 2 obj");
        Date date1 = new Date(11,01,2022);
        Time2 time3 = new Time2(04,57,00);
        System.out.println(dateAndTime);
        DateAndTime dateAndTime1 = new DateAndTime(date1,time3);
        System.out.println(dateAndTime1);
    }
}
