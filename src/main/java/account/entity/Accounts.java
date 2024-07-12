package account.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import account.constant.AccountType;




@Entity
public class Accounts {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long customerNumber;
	private String customerName;
	private String customerMobile;
	private String customerEmail;
	private String address1;
	private String address2;
	

	@OneToMany(mappedBy = "accountNumber", cascade = CascadeType.ALL)
	private List<BankAccounts> bankAccounts;
	
	
	
	public Accounts() {
		super();
	}
	
	
	public Accounts(Long customerNumber, String customerName, String customerMobile, String customerEmail,
			String address1, String address2) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.address1 = address1;
		this.address2 = address2;
	}
	
	


	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	
	
	
	
	
	

}
