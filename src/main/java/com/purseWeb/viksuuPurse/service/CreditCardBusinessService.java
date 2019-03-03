package com.purseWeb.viksuuPurse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.CreditCard;
import com.purseWeb.viksuuPurse.repository.CreditCardRepository;

@Service
public class CreditCardBusinessService {
	
	@Autowired
	private CreditCardRepository repo; 
	
	public CreditCard addCreditCard(CreditCard creditCard) {
		
		CreditCard creditCards = repo.save(creditCard);
		
		return creditCards;
	}
}
