import java.util.Scanner;

public class BankBalanceByRateAndYearMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankBalanceByRateAndYear calculator = new BankBalanceByRateAndYear();

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        calculator.setBalance(balance);
        
        System.out.println();
        calculator.displayInterestTable();

        input.close();
    }
}
