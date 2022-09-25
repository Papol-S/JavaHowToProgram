package Lesson6.Exercise6_29;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    private static enum coinSide {Head , Tail};
    private static int countHead;
    private static int countTail;

    public static int getCountHead() {
        return countHead;
    }

    public static void setCountHead(int countHead) {
        CoinTossing.countHead = countHead;
    }

    public static int getCountTail() {
        return countTail;
    }

    public static void setCountTail(int countTail) {
        CoinTossing.countTail = countTail;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select Menu");
        System.out.println("1. Toss coin");

        int x = input.nextInt();
        while ( x != -1) {
            flip();
            System.out.println("Please select Menu");
            System.out.println("1. Toss coin");
            x = input.nextInt();
        }
        System.out.println("Count head -> "+getCountHead());
        System.out.println("Count tail -> "+getCountTail());
    }

    public static void flip () {
        coinSide side;
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0) {
            side = coinSide.Head;
            System.out.println("You got Head !!");
            countHead++;
        }
        else {
            side = coinSide.Tail;
            System.out.println("You got Tail !!");
            countTail++;
        }
    }
}
