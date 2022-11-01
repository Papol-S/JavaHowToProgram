package Lesson8.Exercise8_7;

public class Time2Test {
    public static void main(String[] args) {
        Time2 time = new Time2();
        System.out.println(time.toUniversalString());

        System.out.println("---Increase second---");
        time.incrementSecond();
        System.out.println(time.toUniversalString());
        System.out.println("---Increase minute---");
        time.incrementMinute();
        System.out.println(time.toUniversalString());
        System.out.println("---Increase hour---");
        time.incrementHour();
        System.out.println(time.toUniversalString());

        System.out.println("---new time---");
        Time2 time2 = new Time2(11,59,59);
        System.out.println(time2.toUniversalString());
        System.out.println("---Increase second---");
        time2.incrementSecond();
        System.out.println(time2.toUniversalString());

        System.out.println("---new time---");
        Time2 time3 = new Time2(23,59,59);
        System.out.println(time3.toString());
        System.out.println("---Increase second---");
        time3.incrementSecond();
        System.out.println(time3.toString());
    }
}
