package bankaccountapp;

import bankaccountapp.utilities.CSV;

import javax.swing.text.Utilities;
import java.security.acl.Owner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();




        // Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\Owner\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = CSV.read(file);

        for (String[] accountHolder : newAccountHolder) {
            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println("Name: " + name
//            + "\nSocial: " + sSN
//            + "\nType: " + accountType
//            + "\nInitial Deposit: " + initDeposit);
            System.out.println();
            System.out.println();
            if(accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if(accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));

            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc: accounts) {

            System.out.println(acc.toString());
            System.out.println("**********");
        }

    }
}
