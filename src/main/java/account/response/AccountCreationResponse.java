package account.response;

public class AccountCreationResponse {


	public AccountCreationResponse(Long transactionStatusCode, String transactionStatusDescription) {
		this.transactionStatusCode = transactionStatusCode;
		this.transactionStatusDescription = transactionStatusDescription;
	}
	
	public Long transactionStatusCode;
	public String transactionStatusDescription;
}
