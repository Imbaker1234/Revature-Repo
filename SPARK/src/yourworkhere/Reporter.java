package yourworkhere;

import java.util.ArrayList;

public class Reporter {
    public Ledger ledger;

    public Reporter(Ledger ledgerInstance) {
        ledger = ledgerInstance ;
    }

    public Reporter() {
        super();
    }

    public int getNumAccounts() {
        return ledger.accountsMap.size();
    }

    public ArrayList getAccountsWithMinimum(double barBalance) {
        ArrayList accountsWithMinimum = new ArrayList<>();
        for (Account account : ledger.accountsMap.values()) {
            if (account.balance > barBalance) {
                accountsWithMinimum.add(account);
            }
        }
        return accountsWithMinimum;
    }

    public void printAllAccounts() {
        for (Account account : ledger.accountsMap.values()) {
            System.out.println(account);
            System.out.println("REPORTER.PRINTALLACCOUNTS");
        }
    }

    public int getNumAccountsByType(String type) {
        int numAccountsByType = 0;
        for (Account account : ledger.accountsMap.values()) {
            if (account.accountType == type) {
                numAccountsByType++;
            }
        }
        return numAccountsByType;
    }
}