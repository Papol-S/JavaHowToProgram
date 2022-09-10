package Lesson4.Exercise4_18;

public class CreditLimitCalculator {
   private int accountNo , beginningBalance , totalCharged , totalCredit;

   public CreditLimitCalculator(int accountNo, int beginningBalance, int totalCharged, int totalCredit) {
      this.accountNo = accountNo;
      this.beginningBalance = beginningBalance;
      this.totalCharged = totalCharged;
      this.totalCredit = totalCredit;
   }

   public int getAccountNo() {
      return accountNo;
   }

   public void setAccountNo(int accountNo) {
      this.accountNo = accountNo;
   }

   public int getTotalCharged() {
      return totalCharged;
   }

   public void setTotalCharged(int totalCharged) {
      this.totalCharged = totalCharged;
   }

   public int getTotalCredit() {
      return totalCredit;
   }

   public void setTotalCredit(int totalCredit) {
      this.totalCredit = totalCredit;
   }

   public int getBeginningBalance() {
      return beginningBalance;
   }

   public void setBeginningBalance(int beginningBalance) {
      this.beginningBalance = beginningBalance;
   }

   public int newBalance (){
      int newBalance = beginningBalance + totalCharged - totalCredit;
      return newBalance;
   }

   public void creditLimitCheck (){
      System.out.printf("New balance is %d\n",newBalance());
      if (newBalance()<0) {
         System.out.println("Credit limit exceeded");
      }
   }

}
