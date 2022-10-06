package Lesson6.Test;

import java.util.Random;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count%13],suits[count/13]);
        }

    }
    public void displayCards (){
        for (int i = 0; i < deck.length; i++) {
            System.out.println("Card number "+i+" is "+deck[i]);
        }
    }

}
