package com.test.springapplications;

import com.test.springapplications.exp.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component(value="accService")
public class AccountService{

	@Autowired
	private AccountDao accDao;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	public AccountService() {
		System.out.println("Inside AccountService Constructor");
	}


	public void deposit(int accNo, double amount) {
		try {
			accDao.deposit(accNo, amount);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void withdraw(int accNo, double amount) {
		try {
			accDao.withdraw(accNo, amount);
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE, rollbackFor=AccountNotFoundException.class)
	public void transfer(int fromAccNo, int toAccNo, double amount) throws AccountNotFoundException{
		accDao.withdraw(fromAccNo, amount);
		accDao.deposit(toAccNo, amount);
	}

}
