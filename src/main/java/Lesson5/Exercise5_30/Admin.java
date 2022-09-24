package Lesson5.Exercise5_30;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id -> ");
        int number = input.nextInt();
        QuestionList ls = new QuestionList(number);
        ls.displayQuestion();
        System.out.println("person id = "+ls.getPersonId());
//        System.out.print("Please insert number -> ");
//        int id = input.nextInt();
        displayScore(ls);
    }
    public static void displayScore (@NotNull QuestionList ls) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert number -> ");
        int number = input.nextInt();

        System.out.println(ls.getScore());
        System.out.println("Person No."+number+"score is "+ls.getScore());
        if (ls.getScore() == 5) {
            System.out.println("Excellent");
        }
        else if (ls.getScore() == 4) {
            System.out.println("Very good");
        }
        else if (ls.getScore() <= 3) {
            System.out.println("Time to brush of your knowledge of global warming");
        }
    }
}
