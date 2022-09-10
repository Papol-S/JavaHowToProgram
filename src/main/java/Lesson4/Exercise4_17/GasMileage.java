/*  Initialize mile
    Initialize gallon
    Initialize malePerGallon
    Initialize sumMilePerGallon = 0
    Initialize tripCounter = 0

    Input miles and gallons of each trip from user

    While the user has not yet entered the sentinel (miles)
        Calculate miles per gallon of each trip
        Print mile per gallon for each trip

        Sum miles per gallon
        Input miles and gallons of each trip from user
        Add one to tripCounter
    Calculate average miles per gallon
    Print miles per gallon
*/
package Lesson4.Exercise4_17;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int mile , gallon;
        int tripCounter = 0;
        double sumMilesPerGallon = 0;
        double averageMilePerGallon , milePerGallon;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles -> ");
        mile = input.nextInt();
        System.out.print("Enter gallons -> ");
        gallon = input.nextInt();

        while (mile != -1) {
            milePerGallon = (double) mile/gallon;
            System.out.printf("Mile per gallon of trip %d is %.2f\n",tripCounter+1,milePerGallon);

            sumMilesPerGallon += milePerGallon;
            System.out.print("Enter miles -> ");
            mile = input.nextInt();
            System.out.print("Enter gallons -> ");
            gallon = input.nextInt();

            ++tripCounter;
        }

        averageMilePerGallon = (double) sumMilesPerGallon/tripCounter;
        System.out.printf("Average miles per gallon for all trips is %.2f\n",averageMilePerGallon);


    }

}
