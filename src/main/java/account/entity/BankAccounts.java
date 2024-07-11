package account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccounts {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long accountNumber;
	private String accountType;
	private double balance;
	
	

}
