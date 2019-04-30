package bankaccountapp;

public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
    private String name;
    private String socialSecurity;
    private double balance;

    static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
    this.name = name;
    this.socialSecurity = sSN;
    balance = initDeposit + 100;


        //Set Account Number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();


    //Common Transaction Methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposting $" + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = socialSecurity.substring(socialSecurity.length()-2, socialSecurity.length());
        int uniqueID = index;
        index++;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", socialSecurity='" + socialSecurity + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", rate=" + rate + '%' + '}';
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //List common methods

}
