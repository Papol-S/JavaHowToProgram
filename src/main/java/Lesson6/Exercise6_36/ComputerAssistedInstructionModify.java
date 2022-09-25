package Lesson6.Exercise6_36;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstructionModify {
    private static final String correctAnswer1 = "Very good!";
    private static final String correctAnswer2 = "Excellent!";
    private static final String correctAnswer3 = "Nice work!";
    private static final String correctAnswer4 = "Keep up the good work!";

    private static final String wrongAnswer1 = "No. Please try again.";
    private static final String wrongAnswer2 = "Wrong. try one more.";
    private static final String wrongAnswer3 = "Don't give up!";
    private static final String wrongAnswer4 = "No. keep trying.";

    private static Random random = new Random();

    public static void main(String[] args) {

        cAI();
    }

    public static void cAI () {
        Scanner input = new Scanner(System.in);
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        System.out.printf("How much is %d time %d\n",x,y);
        int answer = input.nextInt();

        while (answer != x*y) {
            displayCWrongMessage();
            answer = input.nextInt();
        }

        displayCorrectMessage();
    }

    public static void displayCorrectMessage () {
        switch (1 + random.nextInt(4)) {
            case 1:
                System.out.println(correctAnswer1);
                break;
            case 2:
                System.out.println(correctAnswer2);
                break;
            case 3:
                System.out.println(correctAnswer3);
                break;
            case 4:
                System.out.println(correctAnswer4);
                break;
        }
    }

    public static void displayCWrongMessage () {
        switch (1 + random.nextInt(4)) {
            case 1:
                System.out.println(wrongAnswer1);
                break;
            case 2:
                System.out.println(wrongAnswer2);
                break;
            case 3:
                System.out.println(wrongAnswer3);
                break;
            case 4:
                System.out.println(wrongAnswer4);
                break;
        }
    }
}
