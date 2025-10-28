import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        InterestCalculator calculator = new InterestCalculator();

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        calculator.setBalance(balance);

        System.out.println();
        calculator.displayInterestTable();

        input.close();
    }
}
