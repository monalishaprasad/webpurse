package com.purseWeb.viksuuPurse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.CreditCard;
import com.purseWeb.viksuuPurse.service.CreditCardBusinessService;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardBusinessService service;
	
	@PostMapping("/addCreditCard")
	public CreditCard addCreditCard(CreditCard creditCard) {
		CreditCard creditCards =service.addCreditCard(creditCard);
		
		return creditCards;
	}
}
