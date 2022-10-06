package Lesson6.Test;

public class Card {
    private String face;
    private String suit;

    @Override
    public String toString() {
        return face + " of "+ suit;
    }

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
}
