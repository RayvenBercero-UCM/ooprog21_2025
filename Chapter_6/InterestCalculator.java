public class InterestCalculator {
    private double balance;

    public void setBalance(double balance) {
        if (balance <= 0) {
            System.out.println("Balance must be greater than 0.");
            System.exit(0);
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void displayInterestTable() {
        for (int rate = 2; rate <= 5; rate++) {
            double currentBalance = balance;
            double interestRate = rate / 100.0;

            System.out.println("With an initial balance of $" + getBalance() +
                               " at an interest rate of " + interestRate);

            for (int year = 1; year <= 4; year++) {
                currentBalance += currentBalance * interestRate;
                System.out.printf("After year %d balance is $%.2f%n", year, currentBalance);
            }

            System.out.println();
        }
    }
}
