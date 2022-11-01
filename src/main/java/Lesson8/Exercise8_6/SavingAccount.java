package Lesson8.Exercise8_6;

public class SavingAccount {
    private static float annualInterest ;
    private float savingBalance ;

    public SavingAccount(float savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static void modifyInterestRate (float modifyInterest) {
        if (modifyInterest > 0){
            annualInterest = modifyInterest;
        }
        else
            throw new IllegalArgumentException("must greater than 0");
    }

    public void calculateMonthlyInterest () {
        float monthlyInterest = savingBalance * annualInterest /12;
        System.out.printf("Your monthly interest is %.2f\n",monthlyInterest);
        savingBalance += monthlyInterest;
    }

    public float getSavingBalance() {
        return savingBalance;
    }

    public String toString () {
        return String.format("Your account balance is %.2f\n",getSavingBalance());
    }
}
