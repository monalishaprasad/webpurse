package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.DebitCard;
import com.purseWeb.viksuuPurse.service.DebitCardBusinessService;

@RestController
public class DebitCardController {

	@Autowired
	private DebitCardBusinessService service;

	@PostMapping("/addDebitcard")
	public DebitCard getDebitCard(@RequestBody DebitCard addDebitCards) {

		DebitCard debitCards = service.addDebitCard(addDebitCards);

		return debitCards;
	}

	@GetMapping("/getDebitCard")
	public List<DebitCard> getAllDebitCard() {
		List<DebitCard> debitcard = service.getDebitCard();
		return debitcard;

	}
}
