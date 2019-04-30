package yourworkhere;

public class ExampleAccount {

    public static void main(String[] args) {

        double withdrawalAmount = 500.25;
        double depositAmount = 645.18;

        CheckingAccount newChecking = new CheckingAccount(2900.00, "Charles", "Xavier");

        double balance = newChecking.balance;
        String accountSummary = newChecking.toString();
        double P = balance;
        double r = 0.15;
        int t = 1;

        double A = (CompoundCalculator.calculate(P, r, t));
        PrintAccount.execute(balance, withdrawalAmount, depositAmount);

        System.out.println("Your rate of interest gain is: $" + A + "/year");
        System.out.println();
        System.out.println(accountSummary);
    }
}