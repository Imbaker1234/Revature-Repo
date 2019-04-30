package yourworkhere;

public class ExampleAccount2 {

    public static void main(String[] args) {

        double balance;
        double withdrawalAmount;
        double depositAmount;

        balance = 10000.00;
        withdrawalAmount = 50002.21;
        depositAmount = -40020.02;

        if (withdrawalAmount > balance) {
            System.out.println("Withdrawal will result in an overdraft!");
        }

        if (depositAmount <= 0) {
            System.out.println("Deposit amount cannot be negative!");
        }

    }
}
