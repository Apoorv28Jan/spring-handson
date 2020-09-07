package com.test.springapplications;

import com.test.springapplications.exp.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component(value="accDao")
public class AccountDao{

	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	private JdbcTemplate template;
		
	public AccountDao() {
		System.out.println("Inside AccountDao Constructor");
	}

	
	@Transactional(propagation=Propagation.MANDATORY, isolation=Isolation.SERIALIZABLE)
	public void deposit(int accNo, double amount) throws AccountNotFoundException{
		String sql = "update account set amount = amount + " + amount +" where accNo = " + accNo;
		int n = template.update(sql);
		if(n==0) {
			throw new AccountNotFoundException(accNo);
		}
		System.out.println("Amount: "+amount+" deposited in account: "+accNo);
	}

	@Transactional(propagation=Propagation.MANDATORY, isolation=Isolation.SERIALIZABLE)
	public void withdraw(int accNo, double amount) throws AccountNotFoundException{
		String sql = "update account set amount = amount - " + amount +" where accNo = " + accNo;
		int n = template.update(sql);
		if(n==0) {
			throw new AccountNotFoundException(accNo);
		}
		System.out.println("Amount: "+amount+" withdrawn in account: "+accNo);
	}

}
