package account.response;

public class SuccessAccountCreationResponse extends AccountCreationResponse{
	
	public Long customerNumber;

	public SuccessAccountCreationResponse(Long transactionStatusCode, String transactionStatusDescription) {
		super(transactionStatusCode, transactionStatusDescription);
		// TODO Auto-generated constructor stub
	}

	public SuccessAccountCreationResponse(Long transactionStatusCode, String transactionStatusDescription,
			Long customerNumber) {
		super(transactionStatusCode, transactionStatusDescription);
		this.customerNumber = customerNumber;
	}

}
