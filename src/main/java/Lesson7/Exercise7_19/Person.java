package Lesson7.Exercise7_19;

public class Person {
    private String name;
    private int seat;

    public Person(String name, int seat) {
        this.name = name;
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", seat=" + seat +
                '}';
    }
}
