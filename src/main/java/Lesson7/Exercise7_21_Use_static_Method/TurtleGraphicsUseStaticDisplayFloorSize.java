package Lesson7.Exercise7_21_Use_static_Method;

import java.util.Scanner;

public class TurtleGraphicsUseStaticDisplayFloorSize {

    public static void main(String[] args) {
//        FloorSizeDisplayFloorSizeStatic.setRowSize(20);
//        FloorSizeDisplayFloorSizeStatic.setColumnSize(20);
        TurtleNeglectDisplayFloorSize turtle = new TurtleNeglectDisplayFloorSize();
        Scanner input = new Scanner(System.in);
        turtle.reset();
//        turtle.displayFloor();
        FloorSizeDisplayFloorSizeStatic.displayFloor();
        while (turtle.isRunStatus()) {
            System.out.print("Enter command number : ");
            int command = input.nextInt();
            switch (command) {
                case 1 :
                    turtle.penUp();
                    break;
                case 2 :
                    turtle.penDown();
                    break;
                case 3 :
                    turtle.turnRight();
                    break;
                case 4 :
                    turtle.turnLeft();
                    break;
                case 5 :
                    System.out.print("Enter distance : ");
                    int distance = input.nextInt();
                    turtle.moveForward(distance);
                    break;
                case 6 :
                    //turtle.displayFloor();
                    FloorSizeDisplayFloorSizeStatic.displayFloor();
                    break;
                case 9 :
                    turtle.endOfData();
                    break;
                case 0 :
                    turtle.reset();
            }
        }

    }

}
