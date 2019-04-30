package yourworkhere;

public class CheckingAccountManager implements IAccountManager {
    private CheckingAccount account;

    // ===========Constructors==============

    public CheckingAccountManager(CheckingAccount account) {
        this.account = account;
    }

    // ===========Methods==============

    @Override
    public IAccountManager getAccountManager() {
        return null;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit Amount Cannot Be a Negative Value.");
            return false;
        } else {
            account.setBalance(account.getBalance() + amount);
            return true;
        }
    }

    public boolean withdraw(double amount) throws OverdraftException {
        if ((amount < account.balance) && (amount > 0) && (amount != 0)) {
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            throw new OverdraftException("Invalid Transaction!");
        }
    }

}
