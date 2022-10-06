package Lesson6.Exercise6_8;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//import static org.junit.Assert.assertEquals;

public class Parking {
    private static Person checkInPerson;
    public static void main(String[] args) {
            parkingCheckin();
            packingCalc(checkInPerson);
    }

    public static void parkingCheckin () {
        checkInPerson = new Person("test", LocalTime.of(19,42,2));
    }
    public static void packingCalc(Person ps) {
        double parkPrice;
        checkInPerson.setTimeOut(LocalTime.now());
        System.out.println(checkInPerson);
        Long duration = Duration.between(checkInPerson.getTimeIn(),checkInPerson.getTimeOut()).toHours()+1;
        System.out.println(duration);
        if (duration <= 3) {
            parkPrice = 2;
            System.out.printf("Parking fee %.2f",parkPrice);
        } else if (duration>3&&duration<=19) {
            parkPrice = 2+(duration-3)*0.5;
            System.out.printf("Parking fee %.2f",parkPrice);
        }
        else {
            parkPrice = 10;
            System.out.printf("Parking fee %.2f",parkPrice);     
        }
    }


}
