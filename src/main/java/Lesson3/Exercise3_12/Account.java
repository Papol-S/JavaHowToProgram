package Lesson3.Exercise3_12;

public class Account {
    private double balance;

    public Account(double balance) {
        if (balance>0.0)
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount){
        balance = balance + amount;
    }
    public void debit(double amount){
        if (amount>balance)
            System.out.println("Debit amount exceeded account balance");
        else {
            System.out.printf("Debit anount is %.2f\n",amount);
            balance = balance - amount;
        }
    }
}
