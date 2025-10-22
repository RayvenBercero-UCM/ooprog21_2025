import java.util.*;

public class BankAccountInterfaceDoWhileLoop {
    public static void main(String[] args) {
        double balance = getBalanceAccount();
        BankAccount bankAccount = new BankAccount(balance);
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int year = 1;
        
        getNewBalanceAccount(bankAccount, input, choice, year);
        
    }
    public static void getNewBalanceAccount (BankAccount bankAccount, Scanner input, int choice, int year){
    
      do {
            double newBalance = bankAccount.calculateBalanceAccount();
            System.out.println("\nAfter year " + year + " at 0.03 interest rate, balance is " + newBalance);
            year++;
            
            System.out.print("Do you want to see the balance at the end of another year? \nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
        }
        while (choice == 1);
         input.close();
        
    }
      
    public static double getBalanceAccount() {
        System.out.println("Enter initial bank balance >> ");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        return balance;
    }
}