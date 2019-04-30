package yourworkhere;

import java.util.Calendar;

public class CheckingAccount extends Account {

	private double overdraftFee;

	// Default Constructor
	CheckingAccount() {
		setBalance(0.00);
		setFirstName("Johnny");
		setLastName("Cash");
		setOverDraftFee(35.00);
		setAccountType("checking");
	}

	// Set Values Constructor
	CheckingAccount(double balance, String firstName, String lastName) {
		setBalance(balance);
		setFirstName(firstName);
		setLastName(lastName);
		setOverDraftFee(35.00);
		setAccountType("checking");
		// This gets the year the account was made + a random 4 digit
		// number to act as the accountID. Now we might populate this
		// with other useful information such as a numeric designation
		// for state/province (1 for US, 2 for Canada) and so forth.
		// but a small portion will always have to be random to
		// accommodate 2 people of the same name opening an account
		// in the same year.
		accountID = (String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
				+ String.valueOf(((int) (Math.random() * 9000))));
		setAccountID("C" + accountID + firstName.charAt(0) + lastName.charAt(0));
	}

	// Methods

	// Method for constructing the account manager and loading it
	// with this particular account thats instantiating it.
	@Override
	public IAccountManager getAccountManager() {
		return new CheckingAccountManager(this);
	}

	// Getters & Setters - Overdraft Fee
	public double getOverdraftFee() {
		return this.overdraftFee;
	}

	public void setOverDraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}

	// ToString Override
	@Override
	public String toString() {
		String returnVar = ("ID: " + accountID + ", Account Type: " + accountType + ", Depositor: "
				+ firstName + " " + lastName + ", Current Balance: " + balance + ", OverDraft Fee:"
				+ overdraftFee);

		return returnVar;
	}
}
