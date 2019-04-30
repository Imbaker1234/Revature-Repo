package yourworkhere;

import java.lang.reflect.Type;

public class SavingsAccountManager implements IAccountManager {
    private SavingsAccount account;

    // ===========Constructors==============

    public SavingsAccountManager(SavingsAccount account) {
        this.account = account;
    }

// ===========Methods==============

    @Override
    public SavingsAccountManager getAccountManager() {
        return null;
    }

    public boolean withdraw(double amount) {
        if (account.balance > amount) {
            if ((account.getCurrentMonthlyWithdrawals()) >= (account.getMaxMonthlyWithdrawals())) {
                System.out.println("No withdrawals remaining");
                return false;
            } else {
                account.setBalance(account.getBalance() - amount);
                account.setCurrentMonthlyWithdrawals(account.getCurrentMonthlyWithdrawals() + 1);
                System.out.println(
                        "Account has " + (account.getMaxMonthlyWithdrawals() - account.getCurrentMonthlyWithdrawals())
                                + "/" + account.getMaxMonthlyWithdrawals() + " withdrawals remaining.");
            }
        } else {
            System.out.println("Insufficient Funds!");
            return false;
        }
        return true;
    }


    public boolean deposit(double amount) {
        if (amount > 0) {
            account.setBalance(amount + account.getBalance());
            return true;
        } else {
            return false;
        }
    }
}
