package Lesson8.Exercise8_10;
import java.util.EnumSet;

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("All traffic light");
        for ( TrafficLight trafficLight:TrafficLight.values()) {
            System.out.printf("%-10S%4d\n",trafficLight,trafficLight.getDuration());
        }
    }
}
