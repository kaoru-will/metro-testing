package account.constant;

public enum AccountType{
	S("Savings"),
	C("Current");
	
	private String accountCode;
	
	AccountType(String accountCode){
		this.accountCode = accountCode;
	}
	
	public String getAccountCode() {
		return this.accountCode;
	}
}