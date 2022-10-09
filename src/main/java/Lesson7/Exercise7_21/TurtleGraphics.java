package Lesson7.Exercise7_21;

import java.util.Scanner;

public class TurtleGraphics {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner input = new Scanner(System.in);
        turtle.reset();
        turtle.displayFloor();
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
                    turtle.displayFloor();
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
