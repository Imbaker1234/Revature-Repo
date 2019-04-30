package bankaccountapp;

public class Checking extends Account {
    //List the properties specific to a checking account
    private int debitCardNum;
    private int debitCardPin;
    //Constructor to initialize our checking account properties.

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    //List any methods specific to the checking account.

    private void setDebitCard() {
        debitCardNum = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));

    }

    public String toString() {
        return "ACCOUNT TYPE CHECKING:\n" + super.toString() +
                "\nYour Checking Account Features" +
                "\nDebit Card #" + debitCardNum +
                "\nPin #:" + debitCardPin;
    }

}
