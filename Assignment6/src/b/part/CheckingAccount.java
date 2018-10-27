package b.part;

public class CheckingAccount extends Account {

	static private double minBalance = 100.0;
	static private double fee = 10.0;

	public CheckingAccount() {

	}

	public CheckingAccount(String fname, String lname, double cb) {
		super(fname, lname, cb);
	}

	public double debitTransaction(double debitAmount) {
		super.debitTransaction(debitAmount);
		chargeFee();
		return curBalance;
	}

	public double creditTransaction(double creditAmount) {
		super.creditTransaction(creditAmount);
		chargeFee();
		return curBalance;
	}

	private void chargeFee() {
		if (curBalance <= minBalance) {
			curBalance = curBalance - fee;
		}
	}

}
