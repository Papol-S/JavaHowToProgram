package Lesson5.Exercise5_28;

public class RemoveContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if (i != 5) //change i == 5 to be i != 5 and replace continue; with what you wanna do
                System.out.printf("%d ",i);
//                continue;


        }
        System.out.println("\nUsed continue to skip printing 5");
    }
}
