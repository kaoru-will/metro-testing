package account.service;

import account.entity.Accounts;
import account.response.AccountCreationResponse;
import accounts.pojo.AccountsPayload;

public interface AccountsService {

	AccountCreationResponse accountCreation(Accounts accountPayload);
}
