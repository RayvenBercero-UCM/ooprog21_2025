public class BankAccount {
   private double balance;
   private final double INTEREST_RATE = 0.03; 
   
   public BankAccount() {
      this.balance = 0;
   }
   public BankAccount(double balance) {
      this.balance = balance;
   }
   public double getBalanceAccount() {
      return balance;
   }
   public double calculateBalanceAccount() {
      balance = balance * (1 + INTEREST_RATE);
      return balance;
   }
}
