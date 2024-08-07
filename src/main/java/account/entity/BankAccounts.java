package account.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import account.constant.AccountType;

@Entity
public class BankAccounts {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long accountNumber;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	private double balance;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_customerNumber")
	private Accounts account;

	
	

	public BankAccounts() {
		super();
		// TODO Auto-generated constructor stub
	}





	public BankAccounts(Long accountNumber, AccountType accountType, double balance, Accounts account) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.account = account;
	}
	
	
	
	
	
	public BankAccounts(AccountType accountType, double balance) {
		super();
		this.accountType = accountType;
		this.balance = balance;
	}

	




	public BankAccounts(AccountType accountType, double balance, Accounts account) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.account = account;
	}





	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Accounts getAccount() {
		return account;
	}

	public void setAccount(Accounts account) {
		this.account = account;
	}

	
	
	
	

}
