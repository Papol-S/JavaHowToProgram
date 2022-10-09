package Lesson7.Exercise7_19;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static boolean [] seats = new boolean[10];
    private static int seatNumber;

    private static Person [] person = new Person[10];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int type = 0;
        String name = "";
        int count = 0;
        while (type != -1) {
            System.out.print("Please type 1 for FirstClass and Please type 2 for Economy : ");
            type = input.nextInt();
            System.out.print("Please type your name : ");
            name = input.next();
            if (type == 1) {
                if (checkFirstClass() == true) {
                    reserveSeat(type);
                    person[count] = new Person(name,seatNumber);
                    count++;
                } else {
                    if (checkEconomyClass() == true) {
                        System.out.println("Change to Economy y/n");
                        char accept = input.next().charAt(0);
                        if (accept == 'y') {
                            reserveSeat(2);
                            person[count] = new Person(name,seatNumber);
                            count++;
                        }
                    } else {
                        System.out.println("Next flight");
                    }
                }
            } else {
                if (checkEconomyClass() == true) {
                    reserveSeat(type);
                    person[count] = new Person(name,seatNumber);
                    count++;
                } else {
                    if (checkFirstClass() == true) {
                        System.out.println("Change to First class y/n");
                        String accept = input.nextLine();
                        if (accept == "y") {
                            reserveSeat(1);
                            person[count] = new Person(name,seatNumber);
                            count++;
                        }
                    } else {
                        System.out.println("Next flight");
                    }
                }
            }
            displaySeat();

        }
        for (Person val:person) {
            System.out.printf("%s \n",val);
        }
        System.out.println();
    }

    public static int reserveSeat (int flightType) {
        switch (flightType) {
            case 1 :
                for (int i = 0; i < 5; i++) {
                    if (seats[i] == false ) {
                        seats[i] = true;
                        seatNumber = i+1;
                        break;
                    }
                }
                break;
            case 2 :
                for (int i = 5; i < seats.length; i++) {
                    if (seats[i] == false) {
                        seats[i] = true;
                        seatNumber = i+1;
                        break;
                    }
                }
                break;
        }
        return seatNumber;
    }

    public static boolean checkFirstClass () {
        boolean firstClassFree  = false;
        for (int i = 0; i < 5; i++) {
            if (seats[i] == false) {
                firstClassFree = true;
                break;
            }
        }
        return firstClassFree;
    }

    public static boolean checkEconomyClass () {
        boolean economyClassFree = false;
        for (int i = 5; i < seats.length ; i++) {
            if (seats[i] == false) {
                economyClassFree = true;
            }
        }
        return economyClassFree;
    }

    public static void displaySeat () {
        for (boolean val:seats) {
            System.out.printf("%s ",val);
        }
        System.out.println();
    }

}
