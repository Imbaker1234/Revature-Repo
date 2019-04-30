package yourworkhere;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ledger {

    // the single instance of Ledger
    private static final Ledger instance = new Ledger();

    // method to return the single instance
    public static Ledger getInstance() {
        return instance;
    }

    Account acct = new Account() {

        @Override
        public IAccountManager getAccountManager() {
            return null;
        }
    };

    public boolean store(Account acct) {
        if (accountsMap.containsKey(acct.getAccountID())) {
            // If the account exists then create a new accountID
            // which will generate the account number based off
            // relevant details (year, customer name, account type) and
            // get another random 4 digit number to match against the
            // hashmap. This ensures a random and truly unique instance.
            acct.accountID = (String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                    + String.valueOf(((int) (Math.random() * 9000))));
            acct.setAccountID(
                    acct.accountType.charAt(0) + acct.accountID + acct.firstName.charAt(0) + acct.lastName.charAt(0));
            return false;
        }
        accountsMap.put((acct.getAccountID()), acct);
        return true;
    }

    public Account retrieve(String acct) {
        if (accountsMap.containsKey(acct)) {
            return accountsMap.get(acct);
        } else {
            System.out.println("Account doesn't exist");
            return null;
        }
    }

    public Account createAccount(String type, String firstName, String lastName) {
        // Creates an account to pass into our accounts hashmap.
        switch (type) {
            case "checking":
                CheckingAccount createCheckingAcct = new CheckingAccount(0.0, firstName, lastName);
                return createCheckingAcct;

            default:
                SavingsAccount createSavingsAcct = new SavingsAccount(0.0, firstName, lastName);
                return createSavingsAcct;
        }

        // Adds our new account ID and actual object to accounts hashmap.
    }

    // Had to make this public and static to make it available outside of this
    // class. It can be called using ledger.accountsMap
    public static HashMap<String, Account> accountsMap = new HashMap<>();

    public int getNextAccountID() {
        return ((accountsMap.size()) + 1);
    }

    public List getAllAccounts() {

        ArrayList<String> accountList = new ArrayList<String>();

        // This creates an iterator object that rolls through the
        // entire hashmap and sorts it. This iterator used to sort them
        // perfectly till I went alphanumeric with my AccountIDs.
        Set set = accountsMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
        }
        Set set2 = accountsMap.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            accountList.add((String) me2.getKey());
        }
        return accountList;
    }

}