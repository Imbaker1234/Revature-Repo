package yourworkhere;

public abstract class Account {

    protected String accountID;
    protected double balance;
    protected String accountType;
    protected String firstName;
    protected String lastName;

    public abstract IAccountManager getAccountManager();

    // get method
    public String getAccountID() {
        return this.accountID;
    }

    // set method
    protected void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    // get method
    public double getBalance() {
        return this.balance;
    }

    // set method
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // get method
    public String getAccountType() {
        return this.accountType;
    }

    // set method
    protected void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // get method
    public String getFirstName() {
        return this.firstName;
    }

    // set method
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get method
    public String getLastName() {
        return this.lastName;
    }

    // set method
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    }

