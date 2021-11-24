package com.ibm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ecommerce")	
public class OrderController {
	
	
	@RequestMapping(value = "/order/getdata", method = RequestMethod.GET)
	public String getCardDetails() {
		return "Your order is successfully placed. Ref.No: 11551515";
	}
}
