package dao;

import java.util.ArrayList;

import pojos.BankAccount;

public interface DBBankUtils {
	ArrayList<BankAccount> getBankAccount();
	String createBankAccount(BankAccount a);
	

}
