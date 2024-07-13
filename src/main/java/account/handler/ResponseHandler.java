package account.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> generateCreationAccountResponse(String message, Long customerNum, HttpStatus status, Object responseObj,
			int count) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("customerNumber", customerNum);
		map.put("transactionStatusDescription", message);
		map.put("transactionStatusCode", status.value());

		return new ResponseEntity<Object>(map, status);
	}
	
	public static ResponseEntity<Object> generateCustomerInquieryResponse(String message, HttpStatus status, Map<String, Object> responseObj){
		
		if(responseObj == null) {
			responseObj = new HashMap<String, Object>();
		}
		
		responseObj.put("transactionStatusCode", status.value());
		responseObj.put("transactionStatusDescription", message);
		
		return new ResponseEntity<Object>(responseObj, status);
	}

}
