package com.ibm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ecommerce")	
public class LoginController {

	
	@RequestMapping(value = "/login/user", method = RequestMethod.GET)
	public String userLoginValidation() {
		
			return "login";
			
		
	}
	@RequestMapping(value = "/login/user/home", method = RequestMethod.GET)
	public String loginhomepage() {
		
			return "homelogin";
			
		
	}
}
