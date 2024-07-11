package account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.entity.Accounts;
import account.repo.AccountRepository;
import account.response.AccountCreationResponse;
import accounts.pojo.AccountsPayload;

@Service
public class AccountServicesImp implements AccountsService {

	@Autowired
	private AccountRepository accountRepo;
	
	@Override
	public AccountCreationResponse accountCreation(Accounts accounts) {
		// TODO Auto-generated method stub
		
		this.accountRepo.save(accounts);
		
		return null;
	}

}
