package account.service;

import java.util.Optional;

import account.entity.Accounts;
import account.response.AccountCreationResponse;
import accounts.pojo.AccountsPayload;
import dto.AccountDTO;

public interface AccountsService {

	Accounts accountCreation(Accounts accountPayload);
	
	Optional<Accounts> customerAccountInquiry(Long customerNumber);
	
	
}
