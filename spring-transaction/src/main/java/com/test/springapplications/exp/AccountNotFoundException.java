package com.test.springapplications.exp;

public class AccountNotFoundException extends Exception {

	public AccountNotFoundException(int accNo) {
		super("Incorrect Account Number: "+accNo);
	}

}
