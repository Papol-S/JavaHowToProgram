package Lesson7.Exercise7_28;

import java.util.Arrays;

public class RaceTrack {
    private String[] raceTrack = new String[71];

    public Tortoise tortoise = new Tortoise();

    public Hare hare = new Hare();

    public RaceTrack() {
        Arrays.fill(raceTrack, " ");
    }

    public void changeValue (Tortoise tortoise , Hare hare , String tortoiseName , String hareName) {
        try {
            raceTrack[tortoise.getCurrentPosition()] = " ";
            raceTrack[hare.getCurrentPosition()] = " ";
            raceTrack[tortoise.getEndPoint()] = tortoiseName;
            raceTrack[hare.getEndPoint()] = hareName;
            tortoise.setCurrentPosition(tortoise.getEndPoint());
            hare.setCurrentPosition(hare.getEndPoint());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            if (tortoise.getEndPoint() > 70) {
                raceTrack[70] = "T";
                tortoise.setCurrentPosition(70);
            }
            else {
                raceTrack[70] = "H";
                hare.setCurrentPosition(70);
            }
        }
    }

    public void changeValue (String name) {
        try {
            raceTrack[tortoise.getCurrentPosition()] = " ";
            raceTrack[hare.getCurrentPosition()] = " ";
            raceTrack[tortoise.getEndPoint()] = "OUCH!!!";
            tortoise.setCurrentPosition(tortoise.getEndPoint());
            hare.setCurrentPosition(hare.getEndPoint());
        }
        catch (ArrayIndexOutOfBoundsException e) {
                raceTrack[tortoise.getCurrentPosition()] = " ";
                raceTrack[hare.getCurrentPosition()] = " ";
                raceTrack[tortoise.getEndPoint()] = "OUCH!!!";
                tortoise.setCurrentPosition(70);
                hare.setCurrentPosition(70);
        }
    }

    public void display () {
        for (String value: raceTrack) {
            System.out.printf(" %s |",value);
        }
        System.out.println();
    }

    public void reset() {
        Arrays.fill(raceTrack," ");
    }

}
