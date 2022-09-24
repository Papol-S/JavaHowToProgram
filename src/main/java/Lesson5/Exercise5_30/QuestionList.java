package Lesson5.Exercise5_30;

import java.util.Scanner;

public class QuestionList {
    private int score;
    private int personId;

    public QuestionList(int personId) {
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    private void questionList (int i) {
        switch (i) {
            case 1 :
                System.out.println("Question 1");
                System.out.println("a. test");
                System.out.println("b. test");
                System.out.println("c. test");
                System.out.println("d. test");
                break;
            case 2 :
                System.out.println("Question 2");
                System.out.println("a. test");
                System.out.println("b. test");
                System.out.println("c. test");
                System.out.println("d. test");
                break;
            case 3 :
                System.out.println("Question 3");
                System.out.println("a. test");
                System.out.println("b. test");
                System.out.println("c. test");
                System.out.println("d. test");
                break;
            case 4 :
                System.out.println("Question 4");
                System.out.println("a. test");
                System.out.println("b. test");
                System.out.println("c. test");
                System.out.println("d. test");
                break;
            case 5 :
                System.out.println("Question 5");
                System.out.println("a. test");
                System.out.println("b. test");
                System.out.println("c. test");
                System.out.println("d. test");
                break;
            default:
                System.out.println("No question");
        }
    }
    public void displayQuestion () {
        Scanner input = new Scanner(System.in);
        char ask;
        for (int i = 1; i <= 5; i++) {
            questionList(i);
            System.out.print("Please fil your asnwer -> ");
            ask  = input.next().charAt(0);
            System.out.println("ask = "+ask);
            System.out.println("i = "+i);
            countScore(i,ask);
            System.out.println("score = "+getScore());

        }
    }

    private void countScore (int i,int j) {
        if (i == 1) {
            if (j == 'a') {
                score++;
            }
        }
        if (i == 2) {
            if (j == 'b') {
                score++;
            }
        }
        if (i == 3) {
            if (j == 'c') {
                score++;
            }
        }
        if (i == 4) {
            if (j == 'd') {
                score++;
            }

        }
        if (i == 5) {
            if (j == 'd') {
                score++;
            }

        }
    }
}
