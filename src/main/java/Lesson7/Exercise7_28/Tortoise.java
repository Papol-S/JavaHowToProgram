package Lesson7.Exercise7_28;

import java.util.Random;

public class Tortoise {
    private int currentPosition = 1;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    private int endPoint = 0;

    public int getEndPoint() {
        return endPoint;
    }

    //    private RaceTrack raceTrack = new RaceTrack();
    private Random random = new Random();

    public void movement (){
        int movement = random.nextInt(10) + 1;
        if(movement >= 1 && movement <= 5) {
            endPoint = currentPosition + 3;
        }
        else if (movement >= 6 && movement <= 7) {
            endPoint = currentPosition - 6;
            if (endPoint < 1) {
                endPoint = 1;
            }
        }
        else {
            endPoint = currentPosition + 1;
        }
    }

//    public void changeRaceTrack (String name) {
//        raceTrack.changeValue(currentPosition,endPoint,name);
//        currentPosition = endPoint;
//    }
//
//    public void displayRaceTrack () {
//        raceTrack.display();
//    }
}
