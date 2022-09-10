package Lesson3.Exercise3_16;

import java.util.Calendar;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public HeartRates() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int ageCalculator(){
        int age = (Calendar.getInstance().get(Calendar.YEAR))-yearOfBirth;
        return age;
    }

    public int maximumHeartRate (){
        int maximumHeartRate = 220-ageCalculator();
        return maximumHeartRate;
    }

    public int lowTargetHeartRate (){
        int lowTargetHeartRate = maximumHeartRate()*50/100;
        return lowTargetHeartRate;
    }
    public int highTargetHeartRate (){
        int highTargetHeartRate = maximumHeartRate()*85/100;
        return highTargetHeartRate;
    }

}
