package Lesson6.Exercise6_8;


import java.time.LocalDateTime;
import java.time.LocalTime;

public class Person {
    private String carLicense;
    private LocalTime timeIn;
    private LocalTime timeOut;

    public Person(String carLicense, LocalTime timeIn) {
        this.carLicense = carLicense;
        this.timeIn = timeIn;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Person{" +
                "carLicense='" + carLicense + '\'' +
                ", timeIn=" + timeIn +
                ", timeOut=" + timeOut +
                '}';
    }
}
