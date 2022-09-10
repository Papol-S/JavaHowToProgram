package Lesson3.Exercise3_16;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name -> ");
        String firstname = input.nextLine();
        System.out.print("Enter your Last name -> ");
        String lastName = input.nextLine();
        System.out.print("Enter your Day of Birth -> ");
        int dayOfBirth = input.nextInt();
        System.out.print("Enter your Month of Birth -> ");
        int monthOfBirth = input.nextInt();
        System.out.print("Enter your Year of Birth -> ");
        int yearOfBirth = input.nextInt();

        HeartRates person1 = new HeartRates(firstname,lastName,dayOfBirth,monthOfBirth,yearOfBirth);

        System.out.printf("Yor are %s %s\n",person1.getFirstName(),person1.getLastName());
        System.out.printf("Your date of birth are %d/%d/%d\n",person1.getDayOfBirth(),person1.getMonthOfBirth(),person1.getYearOfBirth());
        System.out.printf("Your age are %d year olds\n",person1.ageCalculator());
        System.out.printf("Your maximum heartrate are %d\n",person1.maximumHeartRate());
        System.out.printf("Your target heartrate is between %d and %d bmp.",person1.lowTargetHeartRate(),person1.highTargetHeartRate());
    }
}
