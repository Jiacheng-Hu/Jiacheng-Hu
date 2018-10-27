package test.part;

import b.part.CheckingAccount;

public class CheckingAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50);
		System.out.println(ch1);

		ch1.debitTransaction(0.25);
		System.out.println(ch1);

		ch1.creditTransaction(7.00);
		System.out.println(ch1);

		ch1.creditTransaction(1000000);
		System.out.println(ch1);
	}

}
