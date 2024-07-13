package account.service;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.constant.AccountType;
import account.entity.Accounts;
import account.entity.BankAccounts;
import account.repo.AccountRepository;
import account.repo.BankAccountsRepo;
import account.response.AccountCreationResponse;
import accounts.pojo.AccountsPayload;
import dto.AccountDTO;

@Service
public class AccountServicesImp implements AccountsService {

	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private BankAccountsRepo bankAccountRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Accounts accountCreation(Accounts accounts) {
		// TODO Auto-generated method stub
		
		accounts.setBankAccounts(new ArrayList<BankAccounts>());
		
		Accounts newAccount = this.accountRepo.save(accounts);
		
		BankAccounts newSavings = new BankAccounts(AccountType.S, 0, newAccount);
		BankAccounts newCurrent = new BankAccounts(AccountType.C, 0, newAccount);
		
		bankAccountRepo.save(newSavings);
		bankAccountRepo.save(newCurrent);
		
		
	
		return newAccount;
		
//		return null;
	}

	@Override
	public Optional<Accounts> customerAccountInquiry(Long customerNumber) {
		// TODO Auto-generated method stub
		
		return this.accountRepo.findByCustomerNumber(customerNumber);
	}

}
