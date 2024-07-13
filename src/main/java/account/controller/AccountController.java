package account.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import account.constant.AccountHelper;
import account.entity.Accounts;
import account.handler.ResponseHandler;
import account.service.AccountsService;
import accounts.pojo.AccountsPOJO;
import dto.AccountDTO;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
	
	@Autowired
	private AccountsService accountService;
	
	@PostMapping("/account")
	public ResponseEntity<Object> accountCreation(@RequestBody Accounts account) {
		
		Accounts accountCreated = accountService.accountCreation(account);
		
		return ResponseHandler.generateCreationAccountResponse("Customer Account created", accountCreated.getCustomerNumber(), HttpStatus.OK, accountCreated, 0);
//		return "Hello World";
	}
	
	@GetMapping("/account/{customerNumber}")
	public ResponseEntity<Object> getCustomerAccount(@PathVariable Long customerNumber) throws IllegalAccessException {
		
		
		Optional<Accounts> account = accountService.customerAccountInquiry(customerNumber);
		
		
		if(account.isPresent()) {
			return ResponseHandler.generateCustomerInquieryResponse("Customer Account Found", HttpStatus.FOUND, AccountHelper.convertUsingReflection(account.get()));
		}
		else {
			return ResponseHandler.generateCustomerInquieryResponse("Customer not found", HttpStatus.NOT_FOUND, new HashMap<String, Object>());
		}
		
//		return null;
		
		
	}

}
