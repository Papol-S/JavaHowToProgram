package Lesson7.Exercise7_28;

public class TheTortoiseAndTheHare {
    public static void main(String[] args) throws InterruptedException {
        RaceTrack raceTrack = new RaceTrack();
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
        while (raceTrack.tortoise.getCurrentPosition() != 70 && raceTrack.hare.getCurrentPosition() != 70) {
            raceTrack.tortoise.movement();
            raceTrack.hare.movement();
            if (raceTrack.tortoise.getEndPoint() == raceTrack.hare.getEndPoint()) {
                raceTrack.changeValue("OUCH!!!");
            }
            else {
                raceTrack.changeValue(raceTrack.tortoise, raceTrack.hare, "T","H");
            }
            raceTrack.display();
            Thread.sleep(500);
        }

        if (raceTrack.tortoise.getCurrentPosition() == 70 && raceTrack.hare.getCurrentPosition() == 70) {
            System.out.println("IT'S A TIE.");
        }
        if (raceTrack.tortoise.getCurrentPosition() == 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else {
            System.out.println("HARE WINS!!! YUCH!!!");
        }
    }
}
