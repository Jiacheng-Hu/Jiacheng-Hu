package test.part;

import b.part.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account("John", "Smith", 100);
		System.out.println(ac1);

		ac1.debitTransaction(30.25);
		System.out.println(ac1);

		ac1.creditTransaction(10.10);
		System.out.println(ac1);
	}

}
