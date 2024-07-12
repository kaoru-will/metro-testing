package account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import account.entity.Accounts;
import account.service.AccountsService;
import accounts.pojo.AccountsPOJO;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
	
	@Autowired
	private AccountsService accountService;
	
	@PostMapping("/account")
	public String accountCreation(@RequestBody Accounts account) {
		
		accountService.accountCreation(account);
		return "Hello World";
	}
	
	@GetMapping("/account/{customerNumber}")
	public AccountsPOJO getCustomerAccount() {
		
		return null;
	}

}
