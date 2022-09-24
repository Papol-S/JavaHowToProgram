package Lesson6.Exercise6_8;

import java.time.Duration;
import java.time.LocalTime;

//import static org.junit.Assert.assertEquals;

public class Parking {
    public static void main(String[] args) {
        Person ps = new Person("test", LocalTime.now());
        System.out.println(ps);
        System.out.println(ps.getTimeIn());
        System.out.println(ps.getTimeIn().getHour());

        LocalTime time1 = LocalTime.of(2,00);
        LocalTime time2 = LocalTime.now();
        Duration.between(time1, time2).getSeconds();
        System.out.println(Duration.between(time1, time2).getSeconds());

        System.out.println("---------------------------------");
        LocalTime start = LocalTime.of(1, 20, 25, 1024);
        LocalTime end = LocalTime.of(3, 22, 27, 1544);

        Duration.between(start, end).getSeconds();


        Duration fromDays = Duration.ofDays(1);
        //assertEquals(86400, fromDays.getSeconds());

        Duration fromMinutes = Duration.ofMinutes(60);



        //Duration duration = (Duration.between(time1,time2));

        //Duration fromDays = Duration.ofDays(1);

//        System.out.println(fromDays.toString().substring(2)
//                .replaceAll("(\\d[HMS])(?!$)", "$1 ")
//                .toLowerCase());




    }
//
//    public double packingCalc(Person ps) {
//
//    }

}
