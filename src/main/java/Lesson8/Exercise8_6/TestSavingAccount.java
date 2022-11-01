package Lesson8.Exercise8_6;

public class TestSavingAccount {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000f);
        SavingAccount saver2 = new SavingAccount(3000f);
        SavingAccount.modifyInterestRate(0.04f);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1);

        saver2.calculateMonthlyInterest();
        System.out.println(saver2);

        System.out.println("----------------");

        SavingAccount.modifyInterestRate(0.05f);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1);
        saver2.calculateMonthlyInterest();
        System.out.println(saver2);
    }
}
