package yourworkhere;

import java.util.Calendar;

public class SavingsAccount extends Account {
    private double minBalance;
    private int currentMonthlyWithdrawals;
    private int maxMonthlyWithdrawals;

    // Default Constructor

    SavingsAccount() {
        setBalance(0.00);
        setFirstName("Johnny");
        setLastName("Appleseed");
        accountType = "savings";
        currentMonthlyWithdrawals = 0;
        maxMonthlyWithdrawals = 3;
        minBalance = 500;
        int year = (Calendar.getInstance().get(Calendar.YEAR));
        accountID = (String.valueOf(year) + String.valueOf(((int) (Math.random() * 9000))));
        setAccountID("S" + accountID + firstName.charAt(0) + lastName.charAt(0));
    }

    // Set Values Constructor
    SavingsAccount(double balance, String firstName, String lastName) {
        setBalance(balance);
        setFirstName(firstName);
        setLastName(lastName);
        accountType = "savings";
        currentMonthlyWithdrawals = 0;
        maxMonthlyWithdrawals = 3;
        minBalance = 500;
        accountID = (String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                + String.valueOf(((int) (Math.random() * 9000))));
        setAccountID("S" + accountID + firstName.charAt(0) + lastName.charAt(0));
    }

    // Methods

    // Method for constructing the account manager and loading it
    // with this particular account that's instantiating it.
    @Override
    public IAccountManager getAccountManager() {
        return new SavingsAccountManager(this);
    }

    // Getters & Setters - MinBalance
    public double getMinBalance() {
        return this.minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    // Getters & Setters - CurrentMonthlyWithdrawals
    public int getCurrentMonthlyWithdrawals() {
        return this.currentMonthlyWithdrawals;
    }

    public void setCurrentMonthlyWithdrawals(int currentMonthlyWithdrawals) {
        this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
    }

    // Getters & Setters - MaxMonthlyWithdrawals
    public int getMaxMonthlyWithdrawals() {
        return this.maxMonthlyWithdrawals;
    }

    public void setMaxMonthlyWithdrawals(int maxMonthlyWithdrawals) {
        this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
    }

    // ToString Override
    @Override
    public String toString() {
        String returnVar = ("ID: " + accountID + ", Account Type: " + accountType
                + ", Depositor: " + firstName + " " + lastName + ", Minimum Balance: "
                + minBalance + ", Current Balance: " + balance + ", Withdrawals Remaining: "
                + (maxMonthlyWithdrawals - currentMonthlyWithdrawals) + "/"
                + maxMonthlyWithdrawals);

        return returnVar;
    }
}