package b.part;

public class Account {

	protected String firstName;
	protected String lastName;
	protected double curBalance;

	public Account() {

	}

	public Account(String fname, String lname, double curbalance) {
		firstName = fname;
		lastName = lname;
		curBalance = curbalance;
	}

	public String getAcctType() {
		return this.getClass().getName();
	}

	public double debitTransaction(double debitAmount) {
		curBalance = curBalance - debitAmount;
		return curBalance;
	}

	public double creditTransaction(double creditAmount) {
		curBalance = curBalance + creditAmount;
		return curBalance;
	}

	public String toString() {
		String str = "Account name: " + firstName + " " + lastName + ", Account Type: " + getAcctType() + ", Balance: "
				+ String.format("$%.2f", curBalance);
		return str;
	}

}
