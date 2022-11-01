package Lesson8.Exercise8_10;

public enum TrafficLight {
    GREEN(90),
    YELLOW(3),
    RED(100);

    private final int duration;

    TrafficLight (int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

}
