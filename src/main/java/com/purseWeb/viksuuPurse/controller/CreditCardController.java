package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.CreditCard;
import com.purseWeb.viksuuPurse.service.CreditCardBusinessService;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardBusinessService service;

	@PostMapping("/insertCreditCard")
	public CreditCard addCreditCard(@RequestBody CreditCard creditCard) {
		CreditCard creditCards = service.addCreditCard(creditCard);

		return creditCards;
	}

	@GetMapping("/getCreditCard")
	public List<CreditCard> getTheCreditCard() {

		List<CreditCard> debitCards = service.getDebitCard();
		return debitCards;

	}
}
