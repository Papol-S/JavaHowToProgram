package Lesson7.Exercise7_21_Use_static_Method;

import java.util.Arrays;

public class TurtleNeglectDisplayFloorSize {
    private enum Vector {RIGHT,LEFT,UP,DOWN};

    private boolean runStatus = true;

    public boolean isRunStatus() {
        return runStatus;
    }

    private Vector currentVector = Vector.UP;
    private int [] currentPosition = new int[2];

    private FloorSizeDisplayFloorSizeStatic floorSize = new FloorSizeDisplayFloorSizeStatic();

//    public FloorSizeDisplayFloorSizeStatic getFloorSize() {
//        return floorSize;
//    }

    private int endpoint;

    private boolean penDown = false;


    public int[] getCurrentPosition() {
        System.out.printf("Current position is (%d,%d)",currentPosition[0],currentPosition[1]);
        return currentPosition;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "currentPosition=" + Arrays.toString(currentPosition) +
                '}';
    }

    public void setCurrentPosition(int[] currentPosition) {
        this.currentPosition = currentPosition;
    }

    public boolean isPenDown() {
        return penDown;
    }

    public void setPenDown(boolean penDown) {
        this.penDown = penDown;
    }

    public void penUp() {
        if (penDown == true) {
            this.setPenDown(false);
        }
    }
    public void penDown() {
        if (penDown == false) {
            this.setPenDown(true);
            floorSize.floorChange(currentPosition[0],currentPosition[1]);
        }
    }
    public void turnRight() {
            switch (currentVector) {
                case RIGHT :
                    currentVector = Vector.DOWN;
                    break;
                case DOWN :
                    currentVector = Vector.LEFT;
                    break;
                case LEFT :
                    currentVector = Vector.UP;
                    break;
                case UP :
                    currentVector = Vector.RIGHT;
                    break;
            }
    }
    public void turnLeft() {
            switch (currentVector) {
                case RIGHT:
                    currentVector = Vector.UP;
                    break;
                case UP:
                    currentVector = Vector.LEFT;
                    break;
                case LEFT:
                    currentVector = Vector.DOWN;
                    break;
                case DOWN:
                    currentVector = Vector.RIGHT;
                    break;
            }
    }
    public void moveForward(int command) {
        switch (currentVector) {
            case RIGHT :
                endpoint = currentPosition[1] + command;
                if (endpoint >= floorSize.getColumnSize()) {
                    endpoint = floorSize.getColumnSize()-1;
                }
                if (penDown) {
                    for (int i = currentPosition[1]; i <= endpoint; i++) {
                        floorSize.floorChange(currentPosition[0],i);
                    }
                }
                currentPosition[1] = endpoint;
                break;
            case DOWN :
                endpoint = currentPosition[0] + command;
                if (endpoint >= floorSize.getRowSize()) {
                    endpoint = floorSize.getRowSize()-1;
                }
                if (penDown) {
                    for (int i = currentPosition[0]; i <= endpoint ; i++) {
                        floorSize.floorChange(i,currentPosition[1]);
                    }
                }
                currentPosition[0] = endpoint;
                break;
            case LEFT :
                endpoint = currentPosition[1] - command;
                if (endpoint < 0) {
                    endpoint = 0;
                }
                if (penDown) {
                    for (int i = currentPosition[1]; i >= endpoint; i--) {
                        floorSize.floorChange(currentPosition[0],i );
                    }
                }
                currentPosition[1] = endpoint;
                break;
            case UP :
                endpoint = currentPosition[0] - command;
                if (endpoint < 0) {
                    endpoint = 0;
                }
                if (penDown) {
                    for (int i = currentPosition[0]; i >= endpoint ; i--) {
                        floorSize.floorChange(i,currentPosition[1]);
                    }
                }
                currentPosition[0] = endpoint;
                break;
        }
    }

    public void reset () {
        currentPosition[0] = 0;
        currentPosition[1] = 0;
        runStatus = true;
        floorSize.reset();
        currentVector = Vector.UP;
    }

    public void displayFloor () {
        floorSize.displayFloor();
    }

    public boolean endOfData () {
        return runStatus = false;
    }
}
