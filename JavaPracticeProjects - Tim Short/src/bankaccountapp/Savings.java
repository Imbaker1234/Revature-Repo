package bankaccountapp;

public class Savings extends Account {
    //List the properties specific to a savings account
    private int depositBoxID;
    private int depositBoxKey;

    //Constructor to initialize our savings account properties.
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        depositBoxID = (int)(Math.random() * 1000);
        depositBoxKey = (int)(Math.random() * 10000);
    }

    //List any methods specific to the savings account.
    @Override
    public String toString() {
        return "ACCOUNT TYPE SAVINGS:" +
                "\n" + super.toString() +
                "\nYour Savings Account Features" +
                "\nSafety Deposit Box #" + depositBoxID +
                "\n Safety Deposit Box Key: " + depositBoxKey;
    }

}
